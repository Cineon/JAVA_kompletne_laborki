public class Cwiczenie1 {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        //pełny numer mojego indeksu: 497 66
        int i = 1000;

        do
        {
            System.out.println(i);
            if (i % 66 == 0)
                System.out.printf("\tLiczba %d jest podzielna przez 66\n", i);
            i--;
        }
        while (i >= 0);


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        int[] intArray = new int[] {1, 2, 3, 4, 5};
        int x = 0;
        while (x < intArray.length)
        {
            System.out.println("Wartość dla " + x + " elementu tablicy to: " + intArray[x]);
            x++;
        }

        double[] doubleArray = new double[] {1.1, 2.2, 3.3, 4.4, 5.5};
        int y = 0;
        while (y < doubleArray.length)
        {
            System.out.println("Wartość dla " + y + " elementu tablicy to: " + doubleArray[y]);
            y++;
        }

        String[] stringArray = {"Ala ", "ma ", "kota ", "historia ", "taka "};
        int z = 4;
        while (z >= 0)
        {
            System.out.print(stringArray[z]);
            z--;
        }


        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        //while(true)   // warunek pozostanie zawsze prawdziwy --> nieskończona pętla.
        //{
        //    System.out.print("1asda");
        //}

        //while(false)  // warunek nigdy nie do osiągnięcia
        //{
        //}

    }
}