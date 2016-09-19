/**
 * 
 */

angular.module('app', ['ui.bootstrap']).controller("cntrl", function($scope, $timeout) {

	$scope.hello = 'Caraca maluco';
	$scope.showAlert = false;
	//$scope.restaurant = '';
	var resp = $scope.response;
	$scope.$watch(resp, function(){
		$scope.showAlert = true;
	})
});
