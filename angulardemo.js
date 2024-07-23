let host = "http://localhost:8080/rest";
const app = angular.module("app",[]);
app.controller("ctrl", function($scope,$http){
    $scope.form = {}
    $scope.items = []
    $scope.reset = function(){
        $scope.form = {gender : true, country : 'VN'}
        $scope.load_all();
    }
    $scope.load_all = function(){
        var url =`${host}/students`;
        $http.get(url).then(response => {
            $scope.items = response.data;
            $scope.showCreateButton = true; // Hiển thị nút Create mặc định
            $scope.showUpdateButton = false;
            $scope.showDeleteButton = false;
            $scope.showResetButton = true;
            console.log("Success",response)
        }).catch(error => {
            console.log("Error",error)
        });
    }
    $scope.edit = function(email){
        var url = `${host}/students/${email}`;
        $http.get(url).then(response => {
            $scope.form = response.data;
            // $scope.key = key;
            $scope.showCreateButton = false; // Hiển thị nút Create mặc định
            $scope.showUpdateButton = true;
            $scope.showDeleteButton = true;
            $scope.showResetButton = true;
            console.log("Success",response)
        }).catch(error => {
            console.log("Error",error)
        });
    }
    $scope.create = function(){
        var item = angular.copy($scope.form);
        var url = `${host}/students`;
        $http.post(url, item).then(response => {
            $scope.items.push(item);
            $scope.reset();
            console.log("Success",response)
        }).catch(error => {
            console.log("Error",error)
        });
    }
    $scope.update = function(){
        var item = angular.copy($scope.form);
        var url = `${host}/students/${$scope.form.email}`;
        $http.put(url,item).then(response => {
            var index = $scope.items.findIndex(item => item.email == $scope.form.email)
            $scope.items[index] = response.data;
            console.log("Success",response)
        }).catch(error => {
            console.log("Error",error)
        });
    }
    $scope.delete = function(email){
        var url = `${host}/students/${email}`;
        $http.delete(url).then(response => {
            var index = $scope.items.findIndex(item => item.email == email)
            $scope.items.splice(index,1);
            $scope.reset();
            console.log("Success",response)
        }).catch(error => {
            console.log("Error",error)
        });
    }

    $scope.reset();
    
});