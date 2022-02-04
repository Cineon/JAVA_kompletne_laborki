public class prostokat extends Figura
{
    @Override
    int pole(int wysokosc, int szerokosc)
	{
        return wysokosc * szerokosc;
    }

    @Override
    int obwod(int dlugoscA, int dlugoscB)
	{
        return 2*dlugoscA + 2*dlugoscB;
    }
}