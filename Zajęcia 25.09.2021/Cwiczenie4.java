public class Cwiczenie4 {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        for (int i = 0; i < 10; i++)
        {
            System.out.printf("To jest %d okrążenie pętli\n", i);
            if (i == 5)
                break;
        }

        for (int j = 0; j < 10; j++)
        {
            if (j % 2 != 0)
                continue;
            System.out.printf("To jest %d okrążenie pętli\n", j);
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.printf("To jest %d okrążenie pętli\n", i);
            if (i == 5)
                return;
        }
    }
}