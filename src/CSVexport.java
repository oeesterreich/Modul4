import java.io.BufferedWriter;
import java.util.ArrayList;

public class CSVexport extends Export {


    @Override
    public void Export(ArrayList<Artikel> list) {

        for (Artikel artikel : list) {
            System.out.println("Nummer;Bezeichnung;Einkaufspreis;Ablaufdatum;Kategorienummer");
            System.out.println(artikel.getNummer() + ";" + artikel.getBezeichnung() + ";" + artikel.getEinkaufspreis() + ";" + artikel.getAblaufdatum() + ";" + artikel.getKategorienummer());
        }

    }
}
