/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.services;

import java.util.ArrayList;
import co.edu.uptc.sw2.entities.Autor;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Duban
 */
@Path("AutorServicio")
public class AutorService {
    
    
    @GET
    @Path("GetAutorlist")
    public List<Autor> getAutorList(){
        ArrayList<Autor> list = new ArrayList<Autor>();
        list.add(new Autor("Esopo", "Tunja"));
        list.add(new Autor("Autor2", "Tunja"));
        list.add(new Autor("Autor3", "Tunja"));
        return list;
    }   
}
