package ar.com.ventas.entities;

/**
 *
 * @author argia
 */
public class PorcentajeIva {
    private Long id;
    private Integer codigo;
    private String detalle;
    private Float porcentaje;
    private Boolean activo;

    public PorcentajeIva() {
    }

    public PorcentajeIva(Long id, Integer codigo, String detalle, Float porcentaje, Boolean activo) {
        this.id = id;
        this.codigo = codigo;
        this.detalle = detalle;
        this.porcentaje = porcentaje;
        this.activo = activo;
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

    public Float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
    
}
