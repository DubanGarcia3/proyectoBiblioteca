'use strict';

var listaEstadoPrestamo = [
                            {"id":1, "estado":"PRESTAMO"},
                            {"id":2, "estado":"DEVUELTO"},
                            {"id":3, "estado":"CON_MORA"}
                           ];
var listaPrestamo = [
                    {"id":1, "nombre":"Sebas", "fecha":"10/10/10", "observacion":"no observación", "estadoPrestamo": listaEstadoPrestamo[0].estado, "dias":10, "multa":10000, "libro":"libro1"},
                    {"id":2, "nombre":"Duban", "fecha":"10/10/10", "observacion":"no observación", "estadoPrestamo": listaEstadoPrestamo[1].estado, "dias":20, "multa":10000, "libro":"libro2"}
                    ];
var consecutivoPrestamo=3;

module.controller('PrestamoCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.listaPrestamo = [];
    $scope.listaEstadoPrestamo = listaEstadoPrestamo;
    $scope.listaLibro = listaLibro;
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
//    $scope.listar=function(){
////        $scope.lista = listaPrestamo;
//        $scope.getPrestamo();
//    };
//
//    $scope.listar();
    //guardar
    $scope.nuevoPrestamo = function () {
        $scope.panelEditar = true;
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
        $scope.listaPrestamo.push($scope.datosFormulario);
        alert("Sus datos han sido guardados con éxito");
        $scope.cancelar(); 
    };
    
    $scope.cancelar = function () {
        $scope.panelEditar = false;
        $scope.datosFormulario = {};
    };

    //editar
    $scope.editar = function (data) {
        $scope.panelEditar = true;
        $scope.datosFormulario = data;
    };
    //eliminar
    $scope.eliminar = function (data){
       if (confirm('¿Desea elminar este registro?')) {    
            for(var i=0;i<$scope.listaPrestamo.length;i++){
                if($scope.listaPrestamo[i].id == data.id){
                    $scope.listaPrestamo.splice(i,1);
                }
            }
        }
    };
    
    $scope.getPrestamo = function (){
       $http.get("./webresources/PrestamoServicio/GetPrestamos",{})
            .then(function(response) {
             
                $scope.listaPrestamo = response.data;
        console.log($scope.listaPrestamo.length + " hola sebas" + response.data );
        }, function(){
                alert("error");
        });
    };
$scope.getPrestamo();}]);
