var lunchItApp = angular.module('lunchItApp', []);

lunchItApp.controller('MenuListCtrl', function ($scope) {
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
});