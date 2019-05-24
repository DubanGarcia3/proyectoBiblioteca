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
public class Libro {
    
    private String title;
    private String desc;
    private Integer quantity;
    private Integer edition;
    private Autor autor;

    public Libro(String title, String desc, Integer quantity, Integer edition, Autor autor) {
        this.title = title;
        this.desc = desc;
        this.quantity = quantity;
        this.autor = autor;
        this.edition = edition;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }
}
