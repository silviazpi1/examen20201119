// lectura del fichero csv mediante el objeto plano y su carga en una lista de objetos de este tipo
package org.dis;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

// Otros imports ...

public class LeerCSV {

    public List<golfPlayer> parseaCSV(String path) {
        ....
        List<golfPlayer> players = csvToBean.parse();
        return players;
    }
}
