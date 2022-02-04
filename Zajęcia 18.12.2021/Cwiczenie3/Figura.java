abstract class Figura
{
    abstract int pole(int wysokosc, int szerokosc);
    abstract int obwod(int dlugoscA, int dlugoscB);

    public void nazwaFigury(String figura)
	{
        System.out.println("To jest figura " + figura);

    }
}