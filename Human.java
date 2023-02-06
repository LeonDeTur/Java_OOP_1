public abstract class Human {
    private String sex;
    private String name;
    private int age;

    public void SetSex(String sex){
        this.sex = sex;
    }

    public void SetName(String name){
        this.name = name;
    }
    
    public void SetAge(int age){
        this.age = age;
    }

    public String GetSex(){
        return sex;
    }

    public String GetName(){
        return name;
    }

    public int GetAge(){
        return age;
    }

    public abstract void Say();
}
