public class Autobus {
    private Turista gruppoTuristi;

    public Autobus(Turista gruppoTuristi) {
        this.gruppoTuristi = gruppoTuristi;
    }

    public void partenza() {
        System.out.println("Partenza dall'alloggio dei " + gruppoTuristi.info());
    }

    public void arrivoAlPorto() {
        System.out.println("Arrivo al porto dei " + gruppoTuristi.info());
    }

    public void trasportoCompleto() {
        partenza();
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        arrivoAlPorto();
    }
}

