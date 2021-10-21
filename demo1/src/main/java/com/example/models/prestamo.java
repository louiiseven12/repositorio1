package com.example.models;

import java.util.Date;
import java.util.Objects;

public class prestamo {

    private Date fechaIniPrest;
    private Date fechaFiniPrest;
    private book libroPrest;
    private usuario usuPrest;
    private boolean devueltoTiempo;

    //Constructores.
    public prestamo(Date fechaIniPrest, Date fechaFiniPrest, book libroPrest, usuario usuPrest, boolean devueltoTiempo){
        this.fechaIniPrest=fechaIniPrest;
        this.fechaFiniPrest=fechaFiniPrest;
        this.libroPrest=libroPrest;
        this.usuPrest=usuPrest;
        this.devueltoTiempo=devueltoTiempo;
    }
    public prestamo(){}

    //metodos getter y setter
    public Date getFechaIniPrest(){
        return fechaIniPrest;
    }
    public void setFechaIniPrest(Date fechaIniPrest){
        this.fechaIniPrest=fechaIniPrest;
    }

    public Date getFechaFiniPrest(){
        return fechaFiniPrest;
    }
    public void setFechaFiniPrest(Date fechaFiniPrest){
        this.fechaIniPrest=fechaFiniPrest;
    }

    public book getLibroPrest(){
        return libroPrest;
    }
    public void setLibroPrest(book libroPrest){
        this.libroPrest=libroPrest;
    }

    public usuario getUsuPrest(){
        return usuPrest;
    }
    public void setUsuPrest(usuario usuPrest){
        this.usuPrest=usuPrest;
    }

    public boolean isDevueltoTiempo(){
        return devueltoTiempo;
    }
    public void isDevueltoTiempo(boolean devueltoTiempo){
        this.devueltoTiempo=devueltoTiempo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        prestamo prestamo = (prestamo) o;
        return devueltoTiempo == prestamo.devueltoTiempo && Objects.equals(fechaIniPrest, prestamo.fechaIniPrest) && Objects.equals(fechaFiniPrest, prestamo.fechaFiniPrest) && Objects.equals(libroPrest, prestamo.libroPrest) && Objects.equals(usuPrest, prestamo.usuPrest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaIniPrest, fechaFiniPrest, libroPrest, usuPrest, devueltoTiempo);
    }

    @Override
    public String toString() {
        return "prestamo{" +
                "fechaIniPrest=" + fechaIniPrest +
                ", fechaFiniPrest=" + fechaFiniPrest +
                ", libroPrest=" + libroPrest +
                ", usuPrest=" + usuPrest +
                ", devueltoTiempo=" + devueltoTiempo +
                '}';
    }
}
