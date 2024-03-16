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
public class Usuario {
    private Long id;
    private Integer codigo;
    private String nombre;
    private String password;
    private Boolean administrador;
    private Perfil perfil;
    private Boolean activo;
    private Boolean visible;

    public Usuario() {
    }

    public Usuario(Long id, Integer codigo, String nombre, String password, Boolean administrador, Perfil perfil, Boolean activo, Boolean visible) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.password = password;
        this.administrador = administrador;
        this.perfil = perfil;
        this.activo = activo;
        this.visible = visible;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

}