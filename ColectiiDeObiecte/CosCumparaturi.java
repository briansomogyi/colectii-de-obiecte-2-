package ColectiiDeObiecte;

import java.util.Iterator;
import java.util.LinkedList;

public class CosCumparaturi {
    private LinkedList<Produs> lProdus = new LinkedList<Produs>();

    public CosCumparaturi(LinkedList<Produs> lProdus) {
        this.lProdus = lProdus;
    }

    public LinkedList<Produs> getlProdus() {
        return lProdus;
    }

    public void setlProdus(LinkedList<Produs> lProdus) {
        this.lProdus = lProdus;
    }

    public void adaugaProdus(Produs produs) {
        lProdus.add(produs);
    }

    public double calculeazaTotal() {
        double sum = 0.0;
        Iterator<Produs> iterator = lProdus.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next().getPret();
        }
        return sum;
    }

    public static void testCosCumparaturi() {
        CosCumparaturi cosCumparaturi = new CosCumparaturi(new LinkedList<Produs>());
        cosCumparaturi.adaugaProdus(new Produs("Mere", 10));
        cosCumparaturi.adaugaProdus(new Produs("Pere", 20));
        System.out.println(cosCumparaturi.calculeazaTotal());
    }

    @Override
    public String toString() {
        return "CosCumparaturi [lProdus=" + lProdus + "]";
    }

}
