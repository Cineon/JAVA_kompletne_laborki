import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student[] listOfStudents = new Student[3];

        listOfStudents[0].imie = "Jan";
        listOfStudents[0].nazwisko = "Kowalski";
        listOfStudents[0].wiek = 24;
        listOfStudents[0].czyOplacone = true;

        listOfStudents[1].imie = "Andrzej";
        listOfStudents[1].nazwisko = "Nowak";
        listOfStudents[1].wiek = 21;
        listOfStudents[1].czyOplacone = false;

        listOfStudents[2].imie = "Ola";
        listOfStudents[2].nazwisko = "Skonieczna";
        listOfStudents[2].wiek = 26;
        listOfStudents[2].czyOplacone = true;

        for (int i = 0; i < listOfStudents.length; i++)
        {
            System.out.println("Oto student o indexie: " +  i);
            System.out.printf("Imię: %s, Nazwisko %s\n Wiek: %d, Wniesiona opłata: %b\n\n",listOfStudents[i].imie,listOfStudents[i].nazwisko,listOfStudents[i].wiek,listOfStudents[i].czyOplacone);
        }
    }
}