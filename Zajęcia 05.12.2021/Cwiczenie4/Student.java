public class Student
{
    private Osoba osoba;
    private wydzialEnum wydzial;

    public Student(Osoba osoba, wydzialEnum wydzial)
    {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }

    public Osoba getOsoba () 
    {
        return osoba;
    }

    public void setOsoba (Osoba osoba)
    {
        this.osoba = osoba;
    }

    public wydzialEnum getWydzial ()
    {
        return wydzial;
    }

    public void setWydzial (wydzialEnum wydzial)
    {
        this.wydzial = wydzial;
    }

    public String toString()
    {
        return osoba + " " + "Wydział: " + wydzial;
    }
}