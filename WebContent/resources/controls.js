/**
 * 
 */

angular.module('app', []).controller("cntrl", function($scope) {

	$scope.hello = 'Caraca maluco';
	$scope.showAlert = false;
	$scope.restaurant = '';

	$scope.alert = function() {
		$scope.showAlert = ! $scope.showAlert;
	};

});
