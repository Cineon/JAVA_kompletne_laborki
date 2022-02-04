import java.util.Scanner;


public class Cwiczenie2 {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */
        int ostatniaCyfraIndeksu = 6;
        for (int i = 100; i >= 0; i--)
        {
            if (i % ostatniaCyfraIndeksu == 0)
                System.out.printf("Liczba %d jest podzielna przez ostatnią liczbę indeksu 497 66\n", i);
        }


        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        Scanner scan = new Scanner(System.in);
        int[] intArray = new int[5];

        for (int j = 0; j < intArray.length; j++)
        {
            intArray[j] = scan.nextInt();
        }

        for (int num : intArray)
        {
            System.out.println(num + 11);
        }


    }
}