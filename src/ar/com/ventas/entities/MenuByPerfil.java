package ar.com.ventas.entities;

/**
 *
 * @author argia
 */
public class MenuByPerfil {
    private Long id;
    private Integer codigoPerfil;
    private Integer codigoMenu;
    private String nombreMenu;
    private Perfil perfil;
    private Boolean habilitado;

    public MenuByPerfil() {
    }

    public MenuByPerfil(Long id, Integer codigoPerfil, Integer codigoMenu, String nombreMenu, Perfil perfil, Boolean habilitado) {
        this.id = id;
        this.codigoPerfil = codigoPerfil;
        this.codigoMenu = codigoMenu;
        this.nombreMenu = nombreMenu;
        this.perfil = perfil;
        this.habilitado = habilitado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(Integer codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public Integer getCodigoMenu() {
        return codigoMenu;
    }

    public void setCodigoMenu(Integer codigoMenu) {
        this.codigoMenu = codigoMenu;
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

}