'use strict';

var listaLibro = [
                  {"id": 1, "titulo": "Libro1", "descripcion": "el libro", "cantidad": 31, "edicion": "norma", "autor": "Esopo"},
                  {"id": 2, "titulo": "Libro1", "descripcion": "el libro", "cantidad": 31, "edicion": "norma", "autor": "Esopo"},
                  {"id": 3, "titulo": "Libro1", "descripcion": "el libro", "cantidad": 31, "edicion": "norma", "autor": "Esopo"}
                 ];
var consecutivoCliente = 3;

module.controller('LibroCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = listaLibro;
        $scope.datosFormulario = {};
        $scope.panelEditar = false;
    
        $scope.listar = function () {
            $scope.lista = listaLibro;
        };     

        $scope.listar();
        
        //guardar
        $scope.nuevo = function () {
            $scope.panelEditar = true;
            $scope.datosFormulario = {};
        };

        $scope.guardar = function () {
            $scope.errores = {};
            var error = false;

            if (error)
                return;
            if (!$scope.datosFormulario.id) {
                $scope.datosFormulario.id = consecutivoCliente++;
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
            $scope.panelEditar = true;
            $scope.datosFormulario = data;
        };
        //eliminar
        $scope.eliminar = function (data) {
            if (confirm('\xbfDesea elminar este registro?')) {
                for (var i = 0; i < $scope.lista.length; i++) {
                    if ($scope.lista[i].id == data.id) {
                        $scope.lista.splice(i, 1);
                    }
                }
            }
        };
    }]);
