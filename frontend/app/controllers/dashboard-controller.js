angular.module('tradeMonitorApp')
.controller('DashboardController', function($scope, TradeService) {

  $scope.trades = [];
  $scope.summary = {
    total: 0,
    pending: 0,
    settled: 0,
    cancelled: 0
  };

  $scope.filters = {
    status: '',
    product: ''
  };

  $scope.products = ['FX Forward', 'Swap', 'Option', 'Bond'];
  $scope.statuses = ['NEW', 'PENDING', 'SETTLED', 'CANCELLED'];

  $scope.loadTrades = function() {
    console.log('Loading trades with filters:', $scope.filters);

    TradeService.getTrades($scope.filters)
      .then(function(data) {
        console.log('Trades from API:', data);
        $scope.trades = data;
        $scope.summary = TradeService.getSummary(data);
        console.log('Summary:', $scope.summary);
      })
      .catch(function(error) {
        console.error('Error loading trades:', error);
      });
  };

  $scope.applyFilters = function() {
    $scope.loadTrades();
  };

  $scope.resetFilters = function() {
    $scope.filters = {
      status: '',
      product: ''
    };
    $scope.loadTrades();
  };

  $scope.loadTrades();
});