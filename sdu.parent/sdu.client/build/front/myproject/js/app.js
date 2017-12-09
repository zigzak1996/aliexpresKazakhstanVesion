// angular.module('MyApp', ['ui.router','ngCookies','btford.socket-io', 'ngMessages','mgcrea.ngStrap'])
angular.module('MyApp', ['ui.router'])
    .config(['$urlRouterProvider', '$stateProvider' ,function($urlRouterProvider,$stateProvider) {
        console.log("We are here");
        //$locationProvider.html5Mode(true);
        $urlRouterProvider.otherwise('/sdu/myproject');
        $stateProvider
            .state('home', {
                url: '/sdu/myproject',
                templateUrl: 'views/mainPage.html',
                controller: function($scope,$rootScope,$state,$http){
                    if($rootScope.token == null){
                        $scope.login = true;
                        $scope.registration = true;
                        $scope.logout = false;
                        $scope.myitemss = false;
                        $scope.boxx = false;
                        $scope.newww = false;

                    } else{
                        if($rootScope.token != null){
                            $scope.login = false;
                            $scope.registration = false;
                            $scope.logout = true;
                            $scope.myitemss = true;
                            $scope.boxx = true;
                            $scope.newww = true;

                        }
                    }
                    console.log($rootScope.token);
                    $scope.data = null;
                    $scope.search = function () {
                        var data ={
                            text:$scope.nameItem
                        };
                        $http.post("http://localhost:8080/sdu/api/items/search",data,{
                            headers: {
                                'Content-Type': "x-www-form-urlencoded"
                            }
                        }).then(function (response) {
                            console.log(response.data);
                            $scope.data=response.data;
                        });
                    }
                    $scope.change = function (id) {
                        $state.go('select',{"id":id});
                    }
                }
            }).state('login',{
                url: '/sdu/myproject/login',
                templateUrl: 'views/login.html',
                controller: function($scope,$rootScope,$state,$http){
                    if($rootScope.token == null){
                        $scope.login = true;
                        $scope.registration = true;
                        $scope.logout = false;
                        $scope.myitemss = false;
                        $scope.boxx = false;
                        $scope.newww = false;

                    } else{
                        if($rootScope.token != null){
                            $scope.login = false;
                            $scope.registration = false;
                            $scope.logout = true;
                            $scope.myitemss = true;
                            $scope.boxx = true;
                            $scope.newww = true;

                        }
                    }
                    console.log($rootScope.token);
                    $scope.submit = function () {
                        var data = {
                            email: $scope.email,
                            password: $scope.password
                        };
                        $http.post("http://localhost:8080/sdu/api/user/check", data, {
                            headers: {
                                'Content-Type': "x-www-form-urlencoded"
                            }
                        }).then(function (response) {
                            $rootScope.token = response.data.token;
                            $state.go('home');
                        });
                    }
                }
            }).state('reg',{
                url: '/sdu/myproject/reg',
                templateUrl: 'views/registration.html',
                controller: function($scope,$rootScope,$state,$http){
                    if($rootScope.token == null){
                        $scope.login = true;
                        $scope.registration = true;
                        $scope.logout = false;
                        $scope.myitemss = false;
                        $scope.boxx = false;
                        $scope.newww = false;

                    } else{
                        if($rootScope.token != null){
                            $scope.login = false;
                            $scope.registration = false;
                            $scope.logout = true;
                            $scope.myitemss = true;
                            $scope.boxx = true;
                            $scope.newww = true;

                        }
                    }
                    console.log($rootScope.token);
                    $scope.submit = function () {
                        if($scope.password == $scope.rpassword){
                            var data ={
                                id : "",
                                name : $scope.name,
                                surname: $scope.surname,
                                age: $scope.birthday,
                                email:$scope.email,
                                telephone: $scope.telephone,
                                password:$scope.password,
                                isAccepted:"0"
                            };
                            $http.post("http://localhost:8080/sdu/api/user/save",data,{
                                headers:{
                                    'Content-Type': "x-www-form-urlencoded"
                                }
                            }).then(function(response){
                                var res = response.data.split('\"')[1];
                                if (res == "added"){
                                    $state.go("login");
                                }
                            });
                        }
                        else{
                            $scope.password = "";
                            $scope.rpassword = "";
                        }
                    }
                }
            }).state('select',{
                url: '/sdu/myproject/item/:id',
                templateUrl: 'views/item.html',
                controller: function($scope,$rootScope,$state,$http){
                    if($rootScope.token == null){
                        $scope.login = true;
                        $scope.registration = true;
                        $scope.logout = false;
                        $scope.myitemss = false;
                        $scope.boxx = false;
                        $scope.newww = false;

                    } else{
                        if($rootScope.token != null){
                            $scope.login = false;
                            $scope.registration = false;
                            $scope.logout = true;
                            $scope.myitemss = true;
                            $scope.boxx = true;
                            $scope.newww = true;

                        }
                    }
                    console.log($rootScope.token);
                    if ($state.params.id !=null) {
                        var data = {id: $state.params.id}
                        $http.post("http://localhost:8080/sdu/api/items/select", data, {
                            headers: {
                                'Content-Type': "x-www-form-urlencoded"
                            }
                        }).then(function (response) {
                            console.log(response.data);
                            $scope.data=response.data;
                        });
                    }
                    $scope.add = function () {
                        if($rootScope.token!=null){
                            var data = {
                                id:$state.params.id,
                                token:$rootScope.token
                            }
                            $http.post("http://localhost:8080/sdu/api/box/add",data,{
                                headers:{
                                    'Content-Type': "x-www-form-urlencoded"
                                }
                            }).then(function (response) {
                                console.log(response.data);
                                $state.go('home');
                            });
                        }
                        else {
                            $state.go("login");
                        }
                    }
                    $scope.data = null;
                }
            }).state('box',{
                url: '/sdu/myproject/box',
                templateUrl: 'views/box.html',
                controller: function($scope,$rootScope,$state,$http){
                    if($rootScope.token == null){
                        $scope.login = true;
                        $scope.registration = true;
                        $scope.logout = false;
                        $scope.myitemss = false;
                        $scope.boxx = false;
                        $scope.newww = false;

                    } else{
                        if($rootScope.token != null){
                            $scope.login = false;
                            $scope.registration = false;
                            $scope.logout = true;
                            $scope.myitemss = true;
                            $scope.boxx = true;
                            $scope.newww = true;

                        }
                    }
                    $scope.data = null;
                    console.log($rootScope.token);
                    $scope.change = function (id) {
                        $state.go('boxItem',{'id':id});
                    }
                    if($rootScope.token != null){
                        var data = {
                            token:$rootScope.token
                        };
                        $http.post("http://localhost:8080/sdu/api/box/list",data,{
                            headers:{
                                'Content-Type': "x-www-form-urlencoded"
                            }
                        }).then(function (response) {
                            console.log(response.data);
                            $scope.data = response.data;
                        });
                    }
                    else {
                        $state.go('home');
                    }

                }
            }).state('boxItem',{
                url: '/sdu/myproject/box/item/:id',
                templateUrl: 'views/itemB.html',
                controller: function($scope,$rootScope,$state,$http){
                    if($rootScope.token == null){
                        $scope.login = true;
                        $scope.registration = true;
                        $scope.logout = false;
                        $scope.myitemss = false;
                        $scope.boxx = false;
                        $scope.newww = false;

                    } else{
                        if($rootScope.token != null){
                            $scope.login = false;
                            $scope.registration = false;
                            $scope.logout = true;
                            $scope.myitemss = true;
                            $scope.boxx = true;
                            $scope.newww = true;

                        }
                    }
                    $scope.data = null;
                    console.log($rootScope.token);
                    if($state.params.id != null && $rootScope.token != null){
                        var data = {
                            token:$rootScope.token,
                            id:$state.params.id
                        };
                        $http.post("http://localhost:8080/sdu/api/box/take",data,{
                            headers:{
                                'Content-Type': "x-www-form-urlencoded"
                            }
                        }).then(function (response) {
                            console.log(response.data);
                            $scope.data = response.data;
                            
                        });
                    }
                    else {
                        $state.go('home');
                    }
                    $scope.buy = function () {
                        if($state.params.id != null && $rootScope.token != null){
                            var data = {
                                token:$rootScope.token,
                                id:$state.params.id
                            };
                            $http.post("http://localhost:8080/sdu/api/box/buy",data,{
                                headers:{
                                    'Content-Type': "x-www-form-urlencoded"
                                }
                            }).then(function (response) {
                                $state.go('box');
                            });
                        }
                    }
                    $scope.delete = function () {
                        if($state.params.id != null && $rootScope.token != null){
                            var data = {
                                token:$rootScope.token,
                                id:$state.params.id
                            };
                            $http.post("http://localhost:8080/sdu/api/box/delete",data,{
                                headers:{
                                    'Content-Type': "x-www-form-urlencoded"
                                }
                            }).then(function (response) {
                                $state.go('box');
                            });
                        }
                    }
                }
            }).state('emailSend',{
                url: '/sdu/myproject/email/:id',
                controller: function ($scope,$rootScope,$state,$http) {
                    if($rootScope.token == null){
                        $scope.login = true;
                        $scope.registration = true;
                        $scope.logout = false;
                        $scope.myitemss = false;
                        $scope.boxx = false;
                        $scope.newww = false;

                    } else{
                        if($rootScope.token != null){
                            $scope.login = false;
                            $scope.registration = false;
                            $scope.logout = true;
                            $scope.myitemss = true;
                            $scope.boxx = true;
                            $scope.newww = true;

                        }
                    }
                    var data = $state.params.id +"";
                    console.log($rootScope.token);
                    $http.post("http://localhost:8080/sdu/api/user/"+data,{},{
                        headers:{
                            'Content-Type': "x-www-form-urlencoded"
                        }
                    }).then(function (response) {
                        if (response.data=="ok update"){
                            $state.go('login');
                        }
                        else{
                            $state.go('reg');
                        }
                    });
                }
            }).state('newTovar',{
                url: '/sdu/myproject/items/new',
                templateUrl: 'views/new.html',
                controller: function ($scope,$rootScope,$state,$http) {
                    if($rootScope.token == null){
                        $scope.login = true;
                        $scope.registration = true;
                        $scope.logout = false;
                        $scope.myitemss = false;
                        $scope.boxx = false;
                        $scope.newww = false;

                    } else{
                        if($rootScope.token != null){
                            $scope.login = false;
                            $scope.registration = false;
                            $scope.logout = true;
                            $scope.myitemss = true;
                            $scope.boxx = true;
                            $scope.newww = true;

                        }
                    }
                    console.log($rootScope.token);
                    if($rootScope.token == null) $state.go('home');
                    $scope.submit = function () {
                        var data = {
                            id : -1,
                            name : $scope.name,
                            description: $scope.description,
                            token: $rootScope.token
                        };
                        $http.post("http://localhost:8080/sdu/api/items/update",data,{
                            headers:{
                                'Content-Type': "x-www-form-urlencoded"
                            }
                        }).then(function (response) {
                            console.log(response.data);
                        });
                    }
                }
            }).state('editTovar',{
                url: '/sdu/myproject/items/edit/:id',
                templateUrl: 'views/new.html',
                controller: function ($scope,$rootScope,$state,$http) {
                    if($rootScope.token == null){
                        $scope.login = true;
                        $scope.registration = true;
                        $scope.logout = false;
                        $scope.myitemss = false;
                        $scope.boxx = false;
                        $scope.newww = false;

                    } else{
                        if($rootScope.token != null){
                            $scope.login = false;
                            $scope.registration = false;
                            $scope.logout = true;
                            $scope.myitemss = true;
                            $scope.boxx = true;
                            $scope.newww = true;

                        }
                    }
                    console.log($rootScope.token);
                    if($rootScope.token == null) $state.go('home');
                    var data = {id: $state.params.id}
                    $http.post("http://localhost:8080/sdu/api/items/select", data, {
                        headers: {
                            'Content-Type': "x-www-form-urlencoded"
                        }
                    }).then(function (response) {
                        console.log(response.data);
                        $scope.name = response.data.name;
                        $scope.description = response.data.description;
                    });
                    $scope.submit = function () {
                        var data = {
                            id : $state.params.id,
                            name : $scope.name,
                            description: $scope.description,
                            token: $rootScope.token
                        };
                        $http.post("http://localhost:8080/sdu/api/items/update",data,{
                            headers:{
                                'Content-Type': "x-www-form-urlencoded"
                            }
                        }).then(function (response) {
                            console.log(response.data);
                            $state.go('myitems');
                        });
                    }
                }
            }).state('myitems',{
                url: '/sdu/myproject/myitems',
                templateUrl: 'views/myitems.html',
                controller:function ($scope,$rootScope,$state,$http) {
                    if($rootScope.token == null){
                        $scope.login = true;
                        $scope.registration = true;
                        $scope.logout = false;
                        $scope.myitemss = false;
                        $scope.boxx = false;
                        $scope.newww = false;

                    } else{
                        if($rootScope.token != null){
                            $scope.login = false;
                            $scope.registration = false;
                            $scope.logout = true;
                            $scope.myitemss = true;
                            $scope.boxx = true;
                            $scope.newww = true;

                        }
                    }
                    $scope.data = null;
                    console.log($rootScope.token);
                    if ($rootScope.token != null){
                        var data = {
                            token:$rootScope.token
                        };
                        $http.post("http://localhost:8080/sdu/api/items/myitems",data,{
                            headers:{
                                'Content-Type': "x-www-form-urlencoded"
                            }
                        }).then(function (response) {
                            $scope.data = response.data;
                        });
                    }
                    else {
                        $state.go('home');
                    }
                    $scope.edit = function (id) {
                        $state.go('editTovar',{"id":id});
                    }
                    $scope.delete = function (id) {
                        var data = {
                            token:$rootScope.token,
                            id : id
                        };
                        $http.post("http://localhost:8080/sdu/api/items/delete",data,{
                            headers:{
                                'Content-Type': "x-www-form-urlencoded"
                            }
                        }).then(function (response) {
                            $state.go('home');
                        });
                    }
                }

            }).state('logout',{
                controller: function ($scope,$rootScope,$state,$http) {
                    $rootScope.token = null;
                    $state.go('home');
                }
            });

    }]);
