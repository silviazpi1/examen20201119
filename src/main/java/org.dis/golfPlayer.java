package org.dis;

import com.opencsv.bean.CsvBindByName;

public class golfPlayer {
    public golfPlayer() {

    }

    @CsvBindByName(column = "Posicion", required = true)
    private String Posicion;

    @CsvBindByName(column = "Nombre", required = true)
    private String Nombre;

    @CsvBindByName(column = "Apellido", required = true)
    private String Apellido;

    @CsvBindByName(column = "Pais", required = true)
    private String Pais;

    @CsvBindByName(column = "Edad", required = true)
    private String Edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String posicion) {
        Posicion = posicion;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }
}
