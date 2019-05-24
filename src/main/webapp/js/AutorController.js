'use strict';

var listaAutor=   [
                        {"id":1, "nombre":"Antonio", "nacionalidad":"colombia","libro":"libro1"},
                        {"id":1, "nombre":"Antonia", "nacionalidad":"Argentina","libro":"libro1"}
                    ];
var consecutivoPrestamo=2;

module.controller('AutorCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = listaAutor;
    $scope.listaCliente= listaAutor;
    $scope.listaLibro = listaAutor;
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $scope.lista = listaAutor;
    };

    $scope.listar();
    //guardar
    $scope.nuevo = function () {
        $scope.panelEditar = false;
        $scope.datosFormulario = {};
    };
    
    $scope.guardar = function () {
       $scope.errores = {};
        var error = false;
        
        if (error)
            return;
        if(!$scope.datosFormulario.id){
            $scope.datosFormulario.id=consecutivoPrestamo++;
        }
        $scope.lista.push($scope.datosFormulario);
        alert("Sus datos han sido guardados con éxito");
        $scope.cancelar(); 
    };
    
    $scope.cancelar = function () {
        $scope.panelEditar = false;
        $scope.datosFormulario = {};
    };

    //editar
    $scope.editar = function (data) {
        $scope.panelEditar = false;
        $scope.datosFormulario = data;
    };
    //eliminar
    $scope.eliminar = function (data){
       if (confirm('\xbfDesea elminar este registro?')) {    
            for(var i=0;i<$scope.lista.length;i++){
                if($scope.lista[i].id==data.id){
                    $scope.lista.splice(i,1);
                }
            }
        }
    };
}]);
