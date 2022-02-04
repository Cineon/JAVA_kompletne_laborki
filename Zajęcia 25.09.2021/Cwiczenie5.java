import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    // Zadanie 1
    public static void Zad1Metoda1(int[] arr)
    {
        int addValue = 40;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = addValue;
            addValue--;
        }
    }
    public static void Zad1Metoda2(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.printf("\nOto %d element tablicy o wartości %d", i, arr[i]);
        }
    }

    // Zadanie 2
    public static void forZad2Inputing(String[] arrayForZad2) {
        Scanner forInsertToForZad2 = new Scanner(System.in);
        for(byte i = 0; i < arrayForZad2.length; ++i) {
            System.out.println("Give numbers to Array number: " + i);
            String forInput = forInsertToForZad2.next();
            arrayForZad2[i] = forInput;
        }
    }
    public static void forZad2Printing(String[] arrayForZad2) {
        for(int i = arrayForZad2.length-1; i>=0; i--) {
            System.out.println("Array number  ....");
            System.out.println("Array = " + arrayForZad2[i]);
        }
    }

    // Zadanie 3
    public static void DisplayInfo(String imie)
    {
        System.out.println("\nMoje imię to: " + imie);
    }
    public static void DisplayInfo(String imie, String nazwisko)
    {
        System.out.println("Moje imię i nazwisko to: " + imie + " " + nazwisko);
    }
    public static void DisplayInfo(String imie, String nazwisko, int wiek)
    {
        System.out.println("Moje imię, nazwisko oraz wiek to: " + imie + " " + nazwisko + " " + wiek);
    }

    // Zadanie 4
    public static int Suma(int par1, int par2)
    {
        return par1 + par2;
    }
    public static int Suma(int par1, int par2, int par3)
    {
        return par1 + par2 + par3;
    }


    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */
        int[] arr1 = new int[20];
        Zad1Metoda1(arr1);
        Zad1Metoda2(arr1);


        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */
        String[] arrayForZad2 = new String[6];
        forZad2Inputing(arrayForZad2);
        forZad2Printing(arrayForZad2);


        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */
        String imie = "Marcin";
        String nazwisko = "Kubicki";
        int wiek = 24;
        DisplayInfo(imie);
        DisplayInfo(imie, nazwisko);
        DisplayInfo(imie, nazwisko, wiek);


        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */
        int zmiennaA = Suma(1, 2);
        int zmiennaB = Suma(7, 8, 9);
        System.out.println("\nwynik: " + ((Suma(1, 2)) + (Suma(7, 8, 9))) );




    }

}