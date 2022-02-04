import java.util.Scanner;

public class Cwiczenie6 {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę 5-cio elementową typu:
        a) double[],
        b) char[],
        c) boolean[] 
        przypisać do niej wartości i wyświetlić za pomocą dowolnej pętli. 
        */

        double[] doubleArray = new double[] {1.1, 2.2, 3.3, 4.4, 5.5};

        char[] charArray = new char[] {'a', 'b', 'c', 'd', 'e'};

        boolean[] booleanArray = new boolean[] {true, true, true, false, false};


        for (int i = 0; i<5; i++)
        {
            System.out.println("Oto element " + i + " tablicy doubleArray o wartości: " + doubleArray[i]);
        }
        for (int i = 0; i<5; i++)
        {
            System.out.println("Oto element " + i + " tablicy charArray o wartości: " + charArray[i]);
        }
        for (int i = 0; i<5; i++)
        {
            System.out.println("Oto element " + i + " tablicy booleanArray o wartości: " + booleanArray[i]);
        }


    }
}