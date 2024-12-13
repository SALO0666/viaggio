public class Turista {
    private String nazionalita;
    private int numeroTuristi;

    public Turista(String nazionalita, int numeroTuristi) {
        this.nazionalita = nazionalita;
        this.numeroTuristi = numeroTuristi;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public int getNumeroTuristi() {
        return numeroTuristi;
    }

    public String info() {
        return numeroTuristi + " " + nazionalita;
    }
}

