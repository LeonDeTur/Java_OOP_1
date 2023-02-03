import java.util.ArrayList;

public class Person {
    public String name;
    public Person(String input_name){
        this. name = input_name;
    }
    ArrayList <Person> listName = new ArrayList<>();
    public void AddName(Person p){
        listName.add(p);
    }
    public ArrayList<Person> GetListName(){
        return listName;
    }
}
