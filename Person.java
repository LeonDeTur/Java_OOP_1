import java.util.ArrayList;

public class Person extends Human{

    public Library PersonLibrary;

    public Person(String name, String sex, int age, String libraryName){
        SetName(name);
        SetSex(sex);
        SetAge(0);
        this.PersonLibrary = new Library(libraryName);
    }

    ArrayList <Person> listName = new ArrayList<>();
    public void AddName(Person p){
        listName.add(p);
    }

    public ArrayList<Person> GetListName(){
        return listName;
    }

    public void Say(){
        String name = GetName();
        System.out.println("Hello, my nave is " + name);
    }
    
}
