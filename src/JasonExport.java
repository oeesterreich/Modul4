import java.util.ArrayList;


public class JasonExport extends Export {


    public void Export(ArrayList<Artikel> list) {

        System.out.println("[");

        for (Artikel artikel : list) {

            System.out.println("  {");
            System.out.println("    \"Nummer\": " + artikel.getNummer() + ",");
            System.out.println("    \"Bezeichnung\": \"" + artikel.getBezeichnung() + "\",");
            System.out.println("    \"Einkaufspreis\": " + artikel.getEinkaufspreis() + ",");
            System.out.println("    \"Ablaufdatum\": \"" + artikel.getAblaufdatum() + "\",");
            System.out.println("    \"Kategorienummer\": " + artikel.getKategorienummer());
            System.out.println("  }");
        }

        System.out.println("]");

    }



}


