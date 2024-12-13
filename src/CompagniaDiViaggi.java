import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class CompagniaDiViaggi {
    private Viaggio viaggio;

    public CompagniaDiViaggi() {
        viaggio = new Viaggio();
    }

    public void avviaApp() {
        viaggio.iniziaViaggio();
        scriviRapporto();
        System.out.println("Tutti i viaggi sono stati completati. Rapporto scritto nel file.");
    }

    public void scriviRapporto() {
        Date oggi = new Date();
        String filename = "rapporto_viaggio.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Data: " + oggi.toString() + "\n");

            for (Turista gruppo : viaggio.getGruppi()) {
                writer.write("Viaggio: " + gruppo.getNazionalita() + ": " + gruppo.getNumeroTuristi() + " turisti\n");
            }

        } catch (IOException e) {
            System.err.println("Errore durante la scrittura del file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        CompagniaDiViaggi compagnia = new CompagniaDiViaggi();
        compagnia.avviaApp();
    }
}
