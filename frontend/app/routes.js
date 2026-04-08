angular.module('tradeMonitorApp')
.config(function($routeProvider) {
  $routeProvider
    .when('/dashboard', {
      templateUrl: 'app/templates/dashboard.html',
      controller: 'DashboardController'
    })
    .otherwise({
      redirectTo: '/dashboard'
    });
});