/**
 * Created by pulem3t on 06.03.16.
 */
'use strict';
//客户新增
App.controller('cutomerAddCtrl', ['$scope', '$state', 'CustomerSvcService' ,"$log",
    function ($scope, $state, CustomerSvcService, $log) {


    }
]);


//客户查询
App
.controller('customerQueryCtrl', ['$scope',  'CustomerSvcService',
    function customerQueryCtrl($scope, CustomerSvcService) {
        $scope.table={};
        $scope.table.users=[
            {id:"1",name:"yummy",status:"12",group:"group1"},
            {id:"2",name:"yummy1",status:"13",group:"group2"},
            {id:"3",name:"yummy2",status:"14",group:"group3"},
            {id:"4",name:"yummy3",status:"15",group:"group4"},
            {id:"5",name:"yummy4",status:"16",group:"group5"},


        ];

    }
]);



