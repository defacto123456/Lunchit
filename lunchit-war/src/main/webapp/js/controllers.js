var lunchItApp = angular.module('lunchItApp', []);

lunchItApp.controller('MenuListCtrl', function ($scope) {
  $scope.menus = [
    {'menuName': 'Dou Chi Chicken',
     'menuDetail': 'Chicken steamed with black beans'},
    {'menuName': 'Ma po Tofu',
     'menuDetail': 'Spicy Tofu'},
    {'menuName': 'Shu Zhu Yu',
     'menuDetail': 'Fish in a spicy soup'}
  ];
});