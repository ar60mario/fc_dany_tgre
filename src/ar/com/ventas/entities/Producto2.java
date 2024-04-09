package ar.com.ventas.entities;

import java.sql.Time;
import java.util.Date;

public class Producto2 {

    private Long id;
    private Integer codigo;
    private String detalle;
    private Boolean activo;
    private Boolean actualizarWeb;
    private Boolean actualizarGondola;
    private Boolean actualizarListaPrecios;
    private Boolean listaPdf;
    private Date fechaActualiz;
    private Time horaActualiz;
    private Precio precio;
    private Stock stock;
    private Rubro2 rubro;
    private SubRubro2 subRubro;
    private Proveedor2 proveedor;

    public Producto2() {
    }

    public Producto2(Long id, Integer codigo, String detalle, Boolean activo,
            Boolean actualizarWeb, Boolean actualizarGondola, Boolean actualizarListaPrecios,
            Boolean listaPdf, Date fechaActualiz, Time horaActualiz, Precio precio,
            Stock stock, Rubro2 rubro, SubRubro2 subRubro, Proveedor2 proveedor) {
        this.id = id;
        this.codigo = codigo;
        this.detalle = detalle;
        this.activo = activo;
        this.actualizarWeb = actualizarWeb;
        this.actualizarGondola = actualizarGondola;
        this.actualizarListaPrecios = actualizarListaPrecios;
        this.listaPdf = listaPdf;
        this.fechaActualiz = fechaActualiz;
        this.horaActualiz = horaActualiz;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
        this.subRubro = subRubro;
        this.proveedor = proveedor;
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

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Boolean getActualizarWeb() {
        return actualizarWeb;
    }

    public void setActualizarWeb(Boolean actualizarWeb) {
        this.actualizarWeb = actualizarWeb;
    }

    public Boolean getActualizarGondola() {
        return actualizarGondola;
    }

    public void setActualizarGondola(Boolean actualizarGondola) {
        this.actualizarGondola = actualizarGondola;
    }

    public Boolean getActualizarListaPrecios() {
        return actualizarListaPrecios;
    }

    public void setActualizarListaPrecios(Boolean actualizarListaPrecios) {
        this.actualizarListaPrecios = actualizarListaPrecios;
    }

    public Boolean getListaPdf() {
        return listaPdf;
    }

    public void setListaPdf(Boolean listaPdf) {
        this.listaPdf = listaPdf;
    }

    public Date getFechaActualiz() {
        return fechaActualiz;
    }

    public void setFechaActualiz(Date fechaActualiz) {
        this.fechaActualiz = fechaActualiz;
    }

    public Time getHoraActualiz() {
        return horaActualiz;
    }

    public void setHoraActualiz(Time horaActualiz) {
        this.horaActualiz = horaActualiz;
    }

    public Precio getPrecio() {
        return precio;
    }

    public void setPrecio(Precio precio) {
        this.precio = precio;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Rubro2 getRubro() {
        return rubro;
    }

    public void setRubro(Rubro2 rubro) {
        this.rubro = rubro;
    }

    public SubRubro2 getSubRubro() {
        return subRubro;
    }

    public void setSubRubro(SubRubro2 subRubro) {
        this.subRubro = subRubro;
    }

    public Proveedor2 getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor2 proveedor) {
        this.proveedor = proveedor;
    }

}
