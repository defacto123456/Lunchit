var lunchItApp = angular.module('lunchItApp', []);

lunchItApp.controller('MenuListCtrl', function ($scope, $http) {
	
  $scope.menus = [
    {'menuName': '豆豉鸡',
     'price': '6.50'},
    {'menuName': '麻婆豆腐',
     'price': '7.00'},
    {'menuName': '香菇时菜',
     'price': '6.00'},
    {'menuName': '水煮鱼',
     'price': '8.00'}
  ];
  
  $http({
	  url: "/rest/json/menu/get",
	  method: "GET",
//	  params: ({duration: $scope.tour.duration, destination: $scope.selected})
  }).success(function(data) {
//	  attractionListService.setAttractionsLists(data);
//	  $scope.attractionsList = attractionListService.getAttractionsLists();
	  alert("hi");
  });
  
});