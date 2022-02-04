public class Punkt
{
    // pola
    private int pX = 0;
    private int pY = 0;
    private int pZ = 0;

    
    // konstruktory
    public Punkt()
    {
    }
    public Punkt(int pX)
    {
        this.pX = pX;
    }
    public Punkt(int pX, int pY, int pZ)
    {
        this.pX = pX;
        this.pY = pY;
        this.pZ = pZ;
    }

    
    // gettery, settery
    public int getpX()
    {
        return pX;
    }
    public void setpX(int pX)
    {
        this.pX = pX;
    }
    public int getpY()
    {
        return pY;
    }
    public void setpY(int pY)
    {
        this.pY = pY;
    }
    public int getpZ()
    {
        return pZ * 10;
    }
    public void setpZ(int pZ)
    {
        this.pZ = pZ;
    }
    
    
    // metody
    public int suma()
    {
        return pX + pY + pZ;
    }
    public int roznica()
    {
        return pX - pY - pZ;
    }
    public int roznica(int x, int y, int z)
    {
        return (pX * x) - (pY * y) - (pZ * z);
    }
    public String toString()
    {
        return "X:" + this.pX + " Y:" + this.pY + " Z:" + this.pZ;
    }
}