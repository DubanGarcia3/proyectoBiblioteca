/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.entities;

/**
 *
 * @author Duban
 */
public class Ciudad {
    
    private String name;

    public Ciudad(String name) {
        this.name = name;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }
}
