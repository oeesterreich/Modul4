import java.util.ArrayList;



public class JasonExport extends Export {

    private ArrayList<Artikel> jasonliste;

    public JasonExport(ArrayList<Artikel> jasonliste) {
        this.jasonliste = jasonliste;
    }

    public void Export(ArrayList<Artikel> list) {
        super.Export(list);


    }
}

