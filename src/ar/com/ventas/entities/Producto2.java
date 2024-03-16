package ar.com.ventas.entities;

import java.util.Date;

public class Producto2 {

    private Long id;
    private Integer codigo;
    private String detalle;
    private Precio precio;
    private Boolean activo;
    private Stock stock;
    private Rubro2 rubro;
    private SubRubro2 subRubro;
    private Proveedor2 proveedor;
    private Integer unidadFraccion;
    private Integer unidadCaja;
    private Integer cajasPorBulto;
    private Boolean actualizarWeb;
    private Boolean actualizarGondola;
    private Boolean actualizarListaPrecios;
    private Boolean listaPdf;

    public Producto2() {
    }

}