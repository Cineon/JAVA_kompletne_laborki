public class Main 
{

    public static void main(String[] args)
	{
		/* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        prostokat prostokat = new prostokat();
        prostokat.nazwaFigury("prostokat");
        System.out.println(prostokat.obwod(2, 3));
        System.out.println(prostokat.pole(4, 5));


        kwadrat kwadrat = new kwadrat();
        kwadrat.nazwaFigury("kwadrat");
        System.out.println(kwadrat.obwod(123, 312));
        System.out.println(kwadrat.pole(31313, 6456));
    }
}