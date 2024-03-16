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
public class CuentaCorrienteCliente {
    private Long id;
    private Date fecha;
    private Double debe;
    private Double haber;
    private Double saldo;
    private TipoComprobante tipoComprobante;
    private Cliente2 cliente;

    public CuentaCorrienteCliente() {
    }

    public CuentaCorrienteCliente(Long id, Date fecha, Double debe, Double haber, Double saldo, TipoComprobante tipoComprobante, Cliente2 cliente) {
        this.id = id;
        this.fecha = fecha;
        this.debe = debe;
        this.haber = haber;
        this.saldo = saldo;
        this.tipoComprobante = tipoComprobante;
        this.cliente = cliente;
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

    public Double getDebe() {
        return debe;
    }

    public void setDebe(Double debe) {
        this.debe = debe;
    }

    public Double getHaber() {
        return haber;
    }

    public void setHaber(Double haber) {
        this.haber = haber;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public TipoComprobante getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(TipoComprobante tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public Cliente2 getCliente() {
        return cliente;
    }

    public void setCliente(Cliente2 cliente) {
        this.cliente = cliente;
    }
    
}
