package org.dis;

public class golfPlayer {
    public golfPlayer() {

    }
    //@CSVBindByName
    //Posicion, Nombre, Apellido, Pais, Edad

    private String Posicion;
    private String Nombre;

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String posicion) {
        Posicion = posicion;
    }

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

    private String Apellido;
    private String Pais;
    private String Edad;
}
