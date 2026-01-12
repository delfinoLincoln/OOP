package application;

import entities.ComboDevice;
import entities.ConcretePrinter;
import entities.ConcreteScanner;

public class ProgramDevice {
    public static void main(String[] args) {
        
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My email");
        System.out.println("Scan result: " + s.scan());

        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}