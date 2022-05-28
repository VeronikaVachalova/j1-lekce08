package cz.czechitas.lekce8;
import java.util.Arrays;
import java.util.List;
import cz.czechitas.lekce8.losovani.LosovaciZarizeni;

public class Ukazka {
    public static void main(String[] args ) {
        new LosovaciZarizeni().losujSeznamCisel(1,6,10).forEach(cislo -> System.out.println(cislo));
    }

}
