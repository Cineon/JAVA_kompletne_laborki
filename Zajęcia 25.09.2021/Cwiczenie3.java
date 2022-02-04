import java.util.Scanner;

public class Cwiczenie3 {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */
        Scanner scan = new Scanner(System.in);
        int userNumber;

        System.out.println("Podaj dowolną liczbę całkowitą: ");
        userNumber = scan.nextInt();
        switch(userNumber % 2)
        {
            case 0:
                System.out.println("Podana liczba jest parzysta");
                break;

            default:
                System.out.println("Liczba jest nieparzysta");
        }

        System.out.println("Podaj dowolną liczbę całkowitą: ");
        userNumber = scan.nextInt();
        switch(userNumber % 7)
        {
            case 0:
                System.out.println("Podana liczba jest podzielna przez 7");
                break;

            default:
                System.out.println("Liczba jest niepodzielna przez 7");
        }
        


        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć ilość liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        int[] countArray = new int[] {0, 0, 0, 0, 0, 0};
        String str = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        char[] charArray;
        charArray = str.toCharArray();
        for (char c : charArray)
        {
            switch (c)
            {
                case 'o':
                    ++countArray[0];
                    break;
                case 'p':
                    ++countArray[1];
                    break;
                case 'x':
                    ++countArray[2];
                    break;
                case 'z':
                    ++countArray[3];
                    break;
                case 'q':
                    ++countArray[4];
                    break;
                default:    // default zbiera resztę charów nieokreślonych w w/w case'ach
                    ++countArray[5];
                    break;
            }
        }
        System.out.println("Ilość wystąpień poszczególnych charów:");
        System.out.printf("o: %d - razy\np: %d - razy\nx: %d - razy\nz: %d - razy\nq: %d - razy\ninne: %d",
                countArray[0], countArray[1], countArray[2], countArray[3], countArray[4], countArray[5]);
    }
}