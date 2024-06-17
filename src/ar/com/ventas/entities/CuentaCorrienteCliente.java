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
    private Integer codigo;
    private Double debe;
    private Double haber;
    private Double saldo;
    

    public CuentaCorrienteCliente() {
    }

    public CuentaCorrienteCliente(Long id, Integer codigo, Double debe, Double haber, Double saldo) {
        this.id = id;
        this.codigo = codigo;
        this.debe = debe;
        this.haber = haber;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    
}