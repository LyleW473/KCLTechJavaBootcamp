import java.util.ArrayList;
import java.util.HashMap;

public class Person
{
    public int age;
    public String name;
    public int id;
    public static int numPeopleCreated = 0;
    private static ArrayList<Person> peopleList = new ArrayList<Person>();
    private static HashMap<Integer, String> peopleHashMap = new HashMap<Integer, String>();

    public static void main(String[] args)
    {
        System.out.println(Person.numPeopleCreated);

        Person myPerson = new Person(19, "Lyle");
        System.out.println(Person.numPeopleCreated);
        System.out.println(myPerson.numPeopleCreated);

        Person myPerson2 = new Person(21, "Gee-yi");
        System.out.println(myPerson.numPeopleCreated);
        System.out.println(myPerson2.numPeopleCreated);

        Person myPerson3 = new Person(18, "Lian");
        Person myPerson4 = new Person(17, "Wealthie");
        Person myPerson5 = new Person(19, "Jacelyne");

        for (Person p: Person.peopleList)
        {
            p.printDetails();
            System.out.println();
        }

        for (int i = 0; i < Person.peopleList.size(); i++)
        {
            Person selectedPerson = Person.peopleList.get(i);
            int personsID = selectedPerson.getID();
            System.out.println(personsID + " " + Person.peopleHashMap.get(personsID));
        }
        
        
    }

    public Person(int age, String name)
    {   /*
        - This is the constructor for the Person class
        */
        this.age = age;
        this.name = name;
        this.id = Person.numPeopleCreated;

        // Increment by one
        Person.numPeopleCreated += 1;
        Person.peopleList.add(this);
        Person.peopleHashMap.put(this.id, this.name);

    }   
    
    public void printDetails()
    {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public int getID()
    {
        return this.id;
    }
}
