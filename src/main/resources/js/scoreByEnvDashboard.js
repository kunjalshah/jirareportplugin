// Angular app for myApp panel
// Load the Angular controller
angular.module('scoreByDashboard', []);
angular.module('scoreByDashboard').controller('scoreByDashboardController', ['$scope', function ($scope) {
  $scope.text = "Happy Sunday!";
  $scope.hello = function () {
      alert( $scope.text );
  };
  $scope.phones = [
    {
      name: 'Nexus S',
      snippet: 'Fast just got faster with Nexus S.'
    }, {
      name: 'Motorola XOOM™ with Wi-Fi',
      snippet: 'The Next, Next Generation tablet.'
    }, {
      name: 'MOTOROLA XOOM™',
      snippet: 'The Next, Next Generation tablet.'
    }
  ];
}]);