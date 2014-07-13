'use strict';

//var lunchItApp = angular.module('lunchItApp', [ 'ngRoute',
//		'lunchItControllers' ]);
//
//
//lunchItApp.config([ '$routeProvider', function($routeProvider) {
//	$routeProvider.when('/menus', {
//		templateUrl : 'menu.html',
//		controller : 'MenuListCtrl'
//	}).when('/index', {
//		templateUrl : 'index.html',
//		controller : 'MenuListCtrl'
//	}).otherwise({
//		redirectTo : '/index'
//	});
//} ]);



var lunchItApp = angular.module('lunchItApp', []);




//create a data service that provides a store and a shopping cart that
//will be shared by all views (instead of creating fresh ones for each view).
//lunchItApp.factory("DataService", function() {
//
//	// create shopping cart
//	var myCart = new shoppingCart("LunchItStore");
//
//	// return data object with store and cart
//	return {
//		cart : myCart
//	};
//
//});