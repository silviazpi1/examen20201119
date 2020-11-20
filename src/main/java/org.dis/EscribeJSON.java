//Fichero para mostrar por consola el JSON generado a partir del CSV y almacenarlo en el fichero best-golf-players.json
package org.dis;

import com.google.gson.JsonObject;

import java.util.List;

public class EscribeJSON {

    public static void main(String[] args) {

        LeeCSV FicheroCsv = new LeeCSV();
        List<golfPlayer> jugadores = FicheroCsv.parseaCSV("./best-golf-players.csv");
        int numero_jugadores = jugadores.size();

        JsonObject FicheroJson = new JsonObject();
        FicheroJson.getAsJsonArray();

        for(int i = 0; i < numero_jugadores; i++){
            //FicheroJson
        }
    }
 }
