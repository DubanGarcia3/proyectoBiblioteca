/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.entities;

import java.util.Date;

/**
 *
 * @author Duban
 */
public class Prestamo {
    
    private String date;
    private String Observation;
    private EstadoPrestamo state;
    private Integer days;
    private Double multa;
    private Autor autor;
    private Cliente cliente;

    public Prestamo(String date, String Observation, EstadoPrestamo state, Integer days, Double multa, Autor autor, Cliente cliente) {
        this.date = date;
        this.Observation = Observation;
        this.state = state;
        this.days = days;
        this.multa = multa;
        this.autor = autor;
        this.cliente = cliente;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getObservation() {
        return Observation;
    }

    public void setObservation(String Observation) {
        this.Observation = Observation;
    }

    public EstadoPrestamo getState() {
        return state;
    }

    public void setState(EstadoPrestamo state) {
        this.state = state;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}
