package sos.jh.cz;

import java.util.ArrayList;

public class Computer {

    public ArrayList<Lístek> jizdenky = new ArrayList<>();

    public Computer() {
        this.inicListky();
    }
    String message;
    private void inicListky() {
        jizdenky.add(new Lístek(10, 20));
        jizdenky.add(new Lístek(15, 60));
        jizdenky.add(new Lístek(20, 90));
        jizdenky.add(new Lístek(25, 120));
        jizdenky.add(new Lístek(30, 360));
        jizdenky.add(new Lístek(35, 720));
        jizdenky.add(new Lístek(40, 1440));

        for (Lístek t : jizdenky) {
            message = String.format("Cena: %s, Trvani v min %s", t.cena, t.trvani);
        }
    }
    public void vyberJizdneku(String scannerValue) {
            String number = scannerValue;
            int result = Integer.parseInt(number);
            System.out.println("Vybrana jízdenka je: " + result);
            System.out.println(jizdenky.get(result + 1));
            System.out.println(message);


    }
}
