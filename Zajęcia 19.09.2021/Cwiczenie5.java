import java.util.Scanner;

public class Cwiczenie5 {

    public static void main(String[] args) {

        /* ćw.5 */
        Scanner scan = new Scanner(System.in);


        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        System.out.println("Wpisz swój wiek: ");
        int wiek = scan.nextInt();
        if (wiek % 3 == 0)
            System.out.println("Podzielny przez 3");
        else
            System.out.println("Niepodzielny przez 3");


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        System.out.println("Wpisz swój numer indeksu: ");
        int nr_indeksu = scan.nextInt();
        String wynik = (nr_indeksu % 2 == 0) ? "parzysty" : "nieparzysty";
        System.out.println("Twój numer indeksu jest: " + wynik);


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        System.out.println("Wpisz dowolną liczbę zmiennoprzecinkowa: ");
        double liczba = scan.nextDouble();
        if (liczba == 0)
            System.out.printf("liczba równa zero");
        else if (liczba > 10)
        System.out.printf("liczba jest większa od 10");
    }
}