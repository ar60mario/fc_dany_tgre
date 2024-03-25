package ar.com.ventas.entities;

/**
 *
 * @author argia
 */
public class Stock {
    private Long id;
    private Integer stockActual;
    private Integer stockMinimo;
    private Integer puntoPedido;
    private Integer unidad;
    private Integer caja;
    private Integer bulto;
    
    public Stock() {
    }

    public Stock(Long id, Integer stockActual, Integer stockMinimo, Integer puntoPedido, Integer unidad, Integer caja, Integer bulto) {
        this.id = id;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.puntoPedido = puntoPedido;
        this.unidad = unidad;
        this.caja = caja;
        this.bulto = bulto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public Integer getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(Integer stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public Integer getPuntoPedido() {
        return puntoPedido;
    }

    public void setPuntoPedido(Integer puntoPedido) {
        this.puntoPedido = puntoPedido;
    }

    public Integer getUnidad() {
        return unidad;
    }

    public void setUnidad(Integer unidad) {
        this.unidad = unidad;
    }

    public Integer getCaja() {
        return caja;
    }

    public void setCaja(Integer caja) {
        this.caja = caja;
    }

    public Integer getBulto() {
        return bulto;
    }

    public void setBulto(Integer bulto) {
        this.bulto = bulto;
    }

}