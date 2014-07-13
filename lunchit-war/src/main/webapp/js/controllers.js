'use strict';

//var lunchItControllers = angular.module('lunchItControllers', []);
//
//lunchItControllers.controller('MenuListCtrl', ['$scope', '$http',
//    function($scope, $http) {
//		$http({
//			url : "/rest/json/menu/get",
//			method : "GET",
//		}).success(function(data) {
//			$scope.restaurants = data;
//		});
//}]);



lunchItApp.controller('MenuListCtrl', function($scope, $http) {
	$http({
		url : "/rest/json/menu/get",
		method : "GET",
	}).success(function(data) {
		$scope.restaurants = data;
	});

});






//the lunchItController contains:
//- cart: the shopping cart object



//function lunchItController($scope, $routeParams, DataService, $http) {
//
//	alert("hi");
//	
//	// get cart from service
//	$scope.cart = DataService.cart;
//	
//	
//	$http({
//		url : "/rest/json/menu/get",
//		method : "GET",
//	}).success(function(data) {
//		$scope.restaurants = data;
//	});
//	
//	
//}
