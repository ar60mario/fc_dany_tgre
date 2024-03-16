/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ventas.entities;

/**
 *
 * @author argia
 */
public class CodigoBarra {
    private Long id;
    private Long codigoBarra;
    private Producto2 producto;
    private Boolean activo;

    public CodigoBarra() {
    }

    public CodigoBarra(Long id, Long codigoBarra, Producto2 producto, Boolean activo) {
        this.id = id;
        this.codigoBarra = codigoBarra;
        this.producto = producto;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(Long codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public Producto2 getProducto() {
        return producto;
    }

    public void setProducto(Producto2 producto) {
        this.producto = producto;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
}
