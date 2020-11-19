package org.dis;

import com.opencsv.bean.CsvBindByName;

public class golfPlayer {
    public golfPlayer() {

    }

    @CsvBindByName(column = "Nombre", required = true)
    private String Nombre;

    @CsvBindByName(column = "Apellido", required = true)
    private String Apellido;

    @CsvBindByName(column = "Posicion", required = true)
    private String Posicion;

    @CsvBindByName(column = "Pais", required = true)
    private String Pais;

    @CsvBindByName(column = "Edad", required = true)
    private String Edad;

}
