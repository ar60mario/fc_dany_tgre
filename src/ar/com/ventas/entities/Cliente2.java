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
public class Cliente2 {
    private Long id;
    private Integer codigo;
    private String razonSocial;
    private String cuit;
    private String referencia;
    private Double saldo;
    private Boolean activo;
    private TipoDocumento tipoDocumento;
    private CategoriaAfip categoriaAfip;
    private Domicilio2 domicilio;

    public Cliente2() {
    }

    public Cliente2(Long id, Integer codigo, String razonSocial, String cuit, String referencia, Double saldo, Boolean activo, TipoDocumento tipoDocumento, CategoriaAfip categoriaAfip, Domicilio2 domicilio) {
        this.id = id;
        this.codigo = codigo;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.referencia = referencia;
        this.saldo = saldo;
        this.activo = activo;
        this.tipoDocumento = tipoDocumento;
        this.categoriaAfip = categoriaAfip;
        this.domicilio = domicilio;
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public CategoriaAfip getCategoriaAfip() {
        return categoriaAfip;
    }

    public void setCategoriaAfip(CategoriaAfip categoriaAfip) {
        this.categoriaAfip = categoriaAfip;
    }

    public Domicilio2 getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio2 domicilio) {
        this.domicilio = domicilio;
    }
    
}
