import java.util.*;
public class Main
{

    public static void main(String[] args) 
	{
        
        Osoba osoba1 = new Osoba("Michał", "Małecki", 45777);
        Osoba osoba2 = new Osoba("Jarek", "Jarecki", 78655);
        Osoba osoba3 = new Osoba("Bartek", "Bartkowski", 54345);
        Osoba osoba4 = new Osoba("Darek", "Darecki", 45446);
        Osoba osoba5 = new Osoba("Maria", "Marianna", 56447);

        ArrayList<Student> Studenci = new ArrayList<>(5);
        Studenci.add(new Student(osoba1,wydzialEnum.Finanse));
        Studenci.add(new Student(osoba2,wydzialEnum.Biochemia));
        Studenci.add(new Student(osoba3,wydzialEnum.Zarządzanie));
        Studenci.add(new Student(osoba4,wydzialEnum.Biochemia));
        Studenci.add(new Student(osoba5,wydzialEnum.Finanse));

        for (Student student : Studenci )
		{
            System.out.println(Studenci.toString());
        }
    }
}