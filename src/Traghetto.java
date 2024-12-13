public class Traghetto {
    public void trasporta(Turista gruppoTuristi) {
        System.out.println("Imbarco dei " + gruppoTuristi.info());
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("Partenza dal porto dei " + gruppoTuristi.info());
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        System.out.println("Arrivo sull'isola dei " + gruppoTuristi.info());
    }

    public void ritorno() {
        System.out.println("Il traghetto torna al porto");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }
}
