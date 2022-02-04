import java.util.Scanner;

public class Cwiczenie1 {

    enum LiczbyEnum { JEDEN, DWA, TRZY, CZTERY, PIEC, SZESC}
    enum StatusEnum {KONTYNUUJEMY, KONIEC}

    public static void main(String[] args) {

        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
        * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */
        System.out.println("Wprowadź liczby całkowitę z klawiatury: ");
        while(true)
        {
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            switch(number)
            {
                case 0:
                    System.out.println(StatusEnum.KONIEC);
                    break;
                case 1:
                    System.out.println(LiczbyEnum.JEDEN + " " + StatusEnum.KONTYNUUJEMY);
                    break;
                case 2:
                    System.out.println(LiczbyEnum.DWA + " " + StatusEnum.KONTYNUUJEMY);
                    break;
                case 3:
                    System.out.println(LiczbyEnum.TRZY + " " + StatusEnum.KONTYNUUJEMY);
                    break;
                case 4:
                    System.out.println(LiczbyEnum.CZTERY + " " + StatusEnum.KONTYNUUJEMY);
                    break;
                case 5:
                    System.out.println(LiczbyEnum.PIEC + " " + StatusEnum.KONTYNUUJEMY);
                    break;
                case 6:
                    System.out.println(LiczbyEnum.SZESC + " " + StatusEnum.KONTYNUUJEMY);
                    break;
            }
            if(number == 0)
                break;
        }
    }
}