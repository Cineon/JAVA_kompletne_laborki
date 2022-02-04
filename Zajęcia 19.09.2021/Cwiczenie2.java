import java.util.Scanner;

public class Cwiczenie2 {

    public static void main(String[] args) {

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;

        float e = 5.5F;
        double f = 6.6d;

        char g = 'g';
        boolean h = true;

        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */

        int liczbaA, liczbaB;
        double liczbaX, liczbaY;
        liczbaA = 10;
        liczbaB = 5;
        liczbaX = 10.2;
        liczbaY = 5.5;

        System.out.println(liczbaA +liczbaB);
        System.out.println(liczbaA - liczbaB);
        System.out.println(liczbaA * liczbaB);
        System.out.println(liczbaA / liczbaB);
        System.out.println(liczbaA % liczbaB);

        System.out.println(liczbaX + liczbaY);
        System.out.println(liczbaX - liczbaY);
        System.out.println(liczbaX * liczbaY);
        System.out.println(liczbaX / liczbaY);
        System.out.println(liczbaX % liczbaY);

    }
}