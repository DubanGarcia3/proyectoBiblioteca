/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.services;

import co.edu.uptc.sw2.entities.Autor;
import co.edu.uptc.sw2.entities.Libro;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;

/**
 *
 * @author Duban
 */
@Path("ServicioLibros")
public class LibroService {
    
    @GET
    @Path("GetLibros")
    public ArrayList<Libro> getListLibros(){
        ArrayList<Libro> listLibros = new ArrayList<>();
        listLibros.add(new Libro("javaForDummies", "sin descripcion", 24, 5, new Autor("JJ", "Choco")));
        listLibros.add(new Libro("GOT", "sin descripcion", 24, 5, new Autor("JJ", "Choco")));
        return listLibros;
    }
    
    @GET
    @Path("getLibro")
    public Libro getData(@PathParam("name") String nameLibro){
      if ("javaForDummies".equals(nameLibro)){
         return new Libro("javaForDummies", "sin descripcion", 24, 5, new Autor("JJ", "Choco"));
      }
      if ("GOT".equals(nameLibro)){
         return new Libro("GOT", "sin descripcion", 24, 5, new Autor("JJ", "Choco"));
      }
      throw new WebApplicationException(404);
   }
    
}
