// lectura del fichero csv mediante el objeto plano y su carga en una lista de objetos de este tipo
package org.dis;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.CsvToBean;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.List;


public class LeerCSV {

    public List<golfPlayer> parseaCSV(String path) {

        CsvToBean csvToBean = null;
        try {
            List<golfPlayer> players = CsvToBean.parse();
            BufferedReader fileReader = new BufferedReader(new FileReader("best-golf-players.csv"));
            csvToBean = new CsvToBeanBuilder(fileReader) //Lista de beans para cargar el csv
                    .withType(golfPlayer.class)
                    .withIgnoreLeadingWhiteSpace(true) // Para ignorar blancos
                    .build();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<golfPlayer> players = csvToBean.parse();
        return players;
    }
}
