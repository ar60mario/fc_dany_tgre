/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ventas.structure;

/**
 *
 * @author argia
 */
public enum Menu {
    CLIENTES(1, "CLIENTES", "ARCHIVO"),
    PRODUCTOS(2, "PRODUCTOS", "ARCHIVO"),
    RUBROS(3, "RUBROS", "ARCHIVO"),
    SUB_RUBROS(4, "SUB-RUBROS", "ARCHIVO"),
    PROVEEDORES(5, "PROVEEDORES", "ARCHIVO"),
    USUARIOS(6, "USUARIOS", "ARCHIVO"),
    PERFILES(7, "PERFILES", "ARCHIVO"),
    MODIFPERF(8, "MODIFICAR PERFILES", "HERRAMIENTAS"),
    BTNVERSION(9,"BTN_VERSION","?");

    private final Integer codigo;
    private final String nombre;
    private final String subMenu;

    Menu(Integer codigo, String nombre, String subMenu) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.subMenu = subMenu;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getSubMenu() {
        return subMenu;
    }
}
