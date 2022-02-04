public class kwadrat extends Figura
{
    @Override
    int pole(int wysokosc, int szerokosc)
	{
        return wysokosc * wysokosc;
    }

    @Override
    int obwod(int dlugoscA, int dlugoscB)
	{

        return 2*dlugoscA;
    }
}