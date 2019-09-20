package sos.jh.cz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Computer mainComp = new Computer();
        Display display = new Display();
        String scannerValue;

        do {
            display.DisplayTickets(mainComp.jizdenky);
            System.out.println("");
            System.out.println("Vyber si číslo jízdenky.");
            Scanner input = new Scanner(System.in);
            scannerValue = input.nextLine();
        } while (scannerValue.equals("end"));

    }
}
