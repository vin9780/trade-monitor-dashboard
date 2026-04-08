angular.module('tradeMonitorApp')
.service('TradeService', function($http, APP_CONFIG) {

  this.getTrades = function(filters) {
    filters = filters || {};

    return $http.get('http://localhost:8080/api/trades', {
      params: {
        status: filters.status || '',
        product: filters.product || ''
      }
    }).then(function(res) {
      return res.data;
    });
  };

  this.getSummary = function(trades) {
    trades = trades || [];

    return {
      total: trades.length,
      pending: trades.filter(function(t) {
        return t.status === 'PENDING';
      }).length,
      settled: trades.filter(function(t) {
        return t.status === 'SETTLED';
      }).length,
      cancelled: trades.filter(function(t) {
        return t.status === 'CANCELLED';
      }).length
    };
  };
});