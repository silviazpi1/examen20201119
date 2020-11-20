//Fichero para mostrar por consola el JSON generado a partir del CSV y almacenarlo en el fichero best-golf-players.json
package org.dis;

import com.google.gson.JsonObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscribeJSON {

    public static void main(String[] args) {

        LeeCSV FicheroCsv = new LeeCSV();
        List<golfPlayer> jugadores = FicheroCsv.parseaCSV("./best-golf-players.csv");

        Gson FicheroJson = new GsonBuilder().setPrettyPrinting().create();
        String jsonOutput = FicheroJson.toJson(jugadores);
        try {
            FileWriter fw=new FileWriter("./best-golf-players.json");
            fw.write(jsonOutput);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 }
