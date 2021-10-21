package com.example.models;

import java.util.Objects;

public class usuario {

    private int codeUsu;
    private String nombreUsu;
    private String apellidosUsu;
    private String direccionUsu;
    private boolean moroso;

    public usuario(int codeUsu, String nombreUsu, String apellidosUsu, String direccionUsu, boolean moroso){
        this.codeUsu=codeUsu;
        this.nombreUsu=nombreUsu;
        this.apellidosUsu=apellidosUsu;
        this.direccionUsu=direccionUsu;
        this.moroso=moroso;
    }
    public usuario(){}

    public int getCodeUsu() {
        return codeUsu;
    }
    public void setCodeUsu(int codeUsu) {
        this.codeUsu = codeUsu;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }
    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public String getApellidosUsu() {
        return apellidosUsu;
    }
    public void setApellidosUsu(String apellidosUsu) {
        this.apellidosUsu = apellidosUsu;
    }

    public String getDireccionUsu() {
        return direccionUsu;
    }
    public void setDireccionUsu(String direccionUsu) {
        this.direccionUsu = direccionUsu;
    }

    public boolean isMoroso() {
        return moroso;
    }
    public void setMoroso(boolean moroso) {
        this.moroso = moroso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        usuario usuario = (usuario) o;
        return codeUsu == usuario.codeUsu && moroso == usuario.moroso && Objects.equals(nombreUsu, usuario.nombreUsu) && Objects.equals(apellidosUsu, usuario.apellidosUsu) && Objects.equals(direccionUsu, usuario.direccionUsu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeUsu, nombreUsu, apellidosUsu, direccionUsu, moroso);
    }

    @Override
    public String toString() {
        return "usuario{" +
                "codeUsu=" + codeUsu +
                ", nombreUsu='" + nombreUsu + '\'' +
                ", apellidosUsu='" + apellidosUsu + '\'' +
                ", direccionUsu='" + direccionUsu + '\'' +
                ", moroso=" + moroso +
                '}';
    }
}
