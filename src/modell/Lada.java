package modell;

/**
 *
 * @author horvath.levente
 */
public class Lada {

    public enum Ladak {
        ARANY,
        EZUST,
        BRONZ
    }
    private final Ladak kincsHelye;

    public Lada() {
        this.kincsHelye = Ladak.EZUST;
    }

    public Ladak getKincsHelye() {
        return kincsHelye;
    }

    public boolean aranyFeliratIgaz() {
        return kincsHelye == Ladak.ARANY;
    }

    public boolean ezustFeliratIgaz() {
        return kincsHelye != Ladak.EZUST;

    }

    public boolean bronzFeliratIgaz() {
        return !aranyFeliratIgaz();
    }

    public boolean ervenyesJatek() {
        int igazAllitasok = 0;

        if (aranyFeliratIgaz()) {
            igazAllitasok++;
        }
        if (ezustFeliratIgaz()) {
            igazAllitasok++;
        }
        if (bronzFeliratIgaz()) {
            igazAllitasok++;
        }

        return igazAllitasok == 1;

    }

    public boolean tippEllenorzes(Ladak tipp) {
        return tipp == kincsHelye;
    }
}
