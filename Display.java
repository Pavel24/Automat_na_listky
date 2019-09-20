package sos.jh.cz;


import java.util.*;

public class Display {

    public void DisplayTickets(ArrayList<Lístek> jizdenky) {

        Iterator it = jizdenky.iterator();
        while (it.hasNext()) {
            Lístek Listek = (Lístek) it.next();
            System.out.println("Cena: " + Listek.getCena() + " Trvaní: " + Listek.getTrvani()+" min.");
        }
    }
}
