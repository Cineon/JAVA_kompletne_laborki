import java.util.Scanner;

public class Cwiczenie3 {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */

        String imie, nazwisko;
        int wiek, nr_indeksu;
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj imię i nazwisko: ");
        imie = scan.next();
        nazwisko = scan.next();

        System.out.printf("Podaj wiek oraz numer indeksu");
        wiek = scan.nextInt();
        nr_indeksu = scan.nextInt();

        System.out.println("Oto wpisane dane: ");
        System.out.printf("Imię i nazwisko: %s, %s\nWiek: %d, numer indeksu: %d", imie, nazwisko, wiek, nr_indeksu);


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */

        int liczbaA, liczbaB;

        liczbaA = 5;
        liczbaB = 5;
        liczbaA += 5;
        liczbaB -= 5;
        liczbaA *= 5;
        liczbaB /= 5;
        System.out.printf("\nOto liczby po wykonaniu obliczeń: %d, %d", liczbaA, liczbaB);
    }
}
