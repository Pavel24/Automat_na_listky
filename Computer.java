package sos.jh.cz;

import java.util.ArrayList;

public class Computer {

    public ArrayList<Lístek> jizdenky = new ArrayList<>();

    public Computer(){
        this.inicListky();
    }

    private void inicListky(){
        jizdenky.add(new Lístek(10, 20));
        jizdenky.add(new Lístek(15, 60));
        jizdenky.add(new Lístek(20, 90));
        jizdenky.add(new Lístek(25, 120));
        jizdenky.add(new Lístek(30, 360));
        jizdenky.add(new Lístek(35, 720));
        jizdenky.add(new Lístek(40, 1440));
    }
}
