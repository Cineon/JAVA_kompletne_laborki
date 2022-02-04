import java.util.Scanner;

public class Cwiczenie4 {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean a = true, b = false, c = true;
        int x = 1, y = 0, z = 10;
        int liczba = 5;

        if (liczba >= y && liczba <= z)
            System.out.printf("Zmienna: %d mieści się w przedziale <0,10>\n", liczba);

        if ((a || b) && (a || c) || (10 !=0))
            System.out.printf("Hello java\n");

        System.out.println("negacja zmiennej a: " + !a);

    }
}