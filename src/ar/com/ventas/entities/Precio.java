package ar.com.ventas.entities;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author argia
 */
public class Precio {

    private Long id;
    private Double precio1;
    private Double precio2;
    private Double precio3;
    private Double precio4;
    private Double precio5;
    private Double precio6;
    private Double precio7;
    private Float porcentaje1;
    private Float porcentaje2;
    private Float porcentaje3;
    private Float porcentaje4;
    private Float porcentaje5;
    private Float porcentaje6;
    private Float porcentaje7;
    private Double impuesto;
    private Double costo;
    private PorcentajeIva porcentajeIva;
    private Double sugerido;
    private Date fechaActualizacion;
    private Time horaActualizacion;

    public Precio() {
    }

    public Precio(Long id, Double precio1, Double precio2, Double precio3, Double precio4, Double precio5, 
            Double precio6, Double precio7, Float porcentaje1, Float porcentaje2, Float porcentaje3, 
            Float porcentaje4, Float porcentaje5, Float porcentaje6, Float porcentaje7, Double impuesto, 
            Double costo, PorcentajeIva porcentajeIva, Double sugerido, 
            Date fechaActualizacion, Time horaActualizacion) {
        this.id = id;
        this.precio1 = precio1;
        this.precio2 = precio2;
        this.precio3 = precio3;
        this.precio4 = precio4;
        this.precio5 = precio5;
        this.precio6 = precio6;
        this.precio7 = precio7;
        this.porcentaje1 = porcentaje1;
        this.porcentaje2 = porcentaje2;
        this.porcentaje3 = porcentaje3;
        this.porcentaje4 = porcentaje4;
        this.porcentaje5 = porcentaje5;
        this.porcentaje6 = porcentaje6;
        this.porcentaje7 = porcentaje7;
        this.impuesto = impuesto;
        this.costo = costo;
        this.porcentajeIva = porcentajeIva;
        this.sugerido = sugerido;
        this.fechaActualizacion = fechaActualizacion;
        this.horaActualizacion = horaActualizacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrecio1() {
        return precio1;
    }

    public void setPrecio1(Double precio1) {
        this.precio1 = precio1;
    }

    public Double getPrecio2() {
        return precio2;
    }

    public void setPrecio2(Double precio2) {
        this.precio2 = precio2;
    }

    public Double getPrecio3() {
        return precio3;
    }

    public void setPrecio3(Double precio3) {
        this.precio3 = precio3;
    }

    public Double getPrecio4() {
        return precio4;
    }

    public void setPrecio4(Double precio4) {
        this.precio4 = precio4;
    }

    public Double getPrecio5() {
        return precio5;
    }

    public void setPrecio5(Double precio5) {
        this.precio5 = precio5;
    }

    public Double getPrecio6() {
        return precio6;
    }

    public void setPrecio6(Double precio6) {
        this.precio6 = precio6;
    }

    public Double getPrecio7() {
        return precio7;
    }

    public void setPrecio7(Double precio7) {
        this.precio7 = precio7;
    }

    public Float getPorcentaje1() {
        return porcentaje1;
    }

    public void setPorcentaje1(Float porcentaje1) {
        this.porcentaje1 = porcentaje1;
    }

    public Float getPorcentaje2() {
        return porcentaje2;
    }

    public void setPorcentaje2(Float porcentaje2) {
        this.porcentaje2 = porcentaje2;
    }

    public Float getPorcentaje3() {
        return porcentaje3;
    }

    public void setPorcentaje3(Float porcentaje3) {
        this.porcentaje3 = porcentaje3;
    }

    public Float getPorcentaje4() {
        return porcentaje4;
    }

    public void setPorcentaje4(Float porcentaje4) {
        this.porcentaje4 = porcentaje4;
    }

    public Float getPorcentaje5() {
        return porcentaje5;
    }

    public void setPorcentaje5(Float porcentaje5) {
        this.porcentaje5 = porcentaje5;
    }

    public Float getPorcentaje6() {
        return porcentaje6;
    }

    public void setPorcentaje6(Float porcentaje6) {
        this.porcentaje6 = porcentaje6;
    }

    public Float getPorcentaje7() {
        return porcentaje7;
    }

    public void setPorcentaje7(Float porcentaje7) {
        this.porcentaje7 = porcentaje7;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public PorcentajeIva getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setPorcentajeIva(PorcentajeIva porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }

    public Double getSugerido() {
        return sugerido;
    }

    public void setSugerido(Double sugerido) {
        this.sugerido = sugerido;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Time getHoraActualizacion() {
        return horaActualizacion;
    }

    public void setHoraActualizacion(Time horaActualizacion) {
        this.horaActualizacion = horaActualizacion;
    }

}