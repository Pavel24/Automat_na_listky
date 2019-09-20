package sos.jh.cz;

public class Lístek {

    private int cena;
    private int trvani;

    public Lístek(int cena, int trvani) {
        this.cena = cena;
        this.trvani = trvani;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getTrvani() {
        return trvani;
    }

    public void setTrvani(int trvani) {
        this.trvani = trvani;
    }
}

