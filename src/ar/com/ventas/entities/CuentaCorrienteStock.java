/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ventas.entities;

import java.util.Date;

/**
 *
 * @author argia
 */
public class CuentaCorrienteStock {
    private Long id;
    private Date fecha;
    private Integer ingreso;
    private Integer egreso;
    private Producto2 producto;

    public CuentaCorrienteStock() {
    }

    public CuentaCorrienteStock(Long id, Date fecha, Integer ingreso, Integer egreso, Producto2 producto) {
        this.id = id;
        this.fecha = fecha;
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.producto = producto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getIngreso() {
        return ingreso;
    }

    public void setIngreso(Integer ingreso) {
        this.ingreso = ingreso;
    }

    public Integer getEgreso() {
        return egreso;
    }

    public void setEgreso(Integer egreso) {
        this.egreso = egreso;
    }

    public Producto2 getProducto() {
        return producto;
    }

    public void setProducto(Producto2 producto) {
        this.producto = producto;
    }
    
}
