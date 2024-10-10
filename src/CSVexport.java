import java.io.BufferedWriter;
import java.util.ArrayList;

public class CSVexport extends Export{

    private ArrayList<Artikel> csvliste;

    public CSVexport(ArrayList<Artikel> csvliste) {
        this.csvliste = csvliste;
    }

    @Override
    public void Export(ArrayList<Artikel> list) {

    }
}
