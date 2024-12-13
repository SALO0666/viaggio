import java.util.ArrayList;

public class Viaggio {
    private ArrayList<Turista> gruppi;
    private Traghetto traghetto;

    public Viaggio() {
        gruppi = new ArrayList<>();
        gruppi.add(new Turista("francesi", 25));
        gruppi.add(new Turista("tedeschi", 25));
        gruppi.add(new Turista("spagnoli", 25));
        traghetto = new Traghetto();
    }

    public void iniziaViaggio() {
        for (Turista gruppo : gruppi) {
            // Trasporto con l'autobus
            Autobus autobus = new Autobus(gruppo);
            autobus.trasportoCompleto();

            // Imbarco con il traghetto
            traghetto.trasporta(gruppo);
            traghetto.ritorno();
        }
    }

    public ArrayList<Turista> getGruppi() {
        return gruppi;
    }
}
