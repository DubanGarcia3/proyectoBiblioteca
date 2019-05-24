/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.services;

import co.edu.uptc.sw2.entities.Autor;
import co.edu.uptc.sw2.entities.Cliente;
import co.edu.uptc.sw2.entities.EstadoPrestamo;
import co.edu.uptc.sw2.entities.Prestamo;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Duban
 */

@Path("PrestamoServicio")
public class PrestamoService {
    
    @GET
    @Path("GetPrestamos")
    public List<Prestamo> getListLibros(){
        List<Prestamo> listPrestamo = new ArrayList<>();
//        Prestamo prestamo = new Prestamo();
//        prestamo.se
        listPrestamo.add(new Prestamo("fecha", "no obs", EstadoPrestamo.DEVUELTO, 
                24, 12.00, new Autor("sebas", "Jamaica"), new Cliente("cliente", "enrique segoviano", "3134445858")));
         
        return listPrestamo;
    }
    
   @GET
   @Path("Lista")
   public List<Prestamo> GetEstudiante(){
       List<Prestamo>  lista  =  new ArrayList<Prestamo>();
       Prestamo aux = new Prestamo(null, "", EstadoPrestamo.MORA, Integer.SIZE, Double.NaN, null, null);
      
       lista.add(aux);
       return lista ;
   }
}
