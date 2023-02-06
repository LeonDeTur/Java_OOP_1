public class prog {
    public static void main(String[] args) {
        // Person dad = new Person("Alex");
        // Person son = new Person("Leon");
        // Person daugter = new Person("Emma");
        // Person granddaughter = new Person("Molly");
        // Person grandson = new Person("Alexander");

        Person father = new Person("Alex", "Male", 59, "libDad");
        Person son = new Person("Leon", "Male", 32, "libSon");
        Person daugter = new Person("Emma", "Female", 32, "libDughter");
        Person granddaughter = new Person("Molly", "Female", 10, "");
        Person grandsonDaughter = new Person("Alexander", "Male", 6, "");
        Person grandsonSon = new Person("Sam", "Male", 3, "");

        father.AddName(son);
        father.AddName(daugter);
        son.AddName(grandsonSon);
        daugter.AddName(grandsonDaughter);
        daugter.AddName(granddaughter);

        father.PersonLibrary.AddBook("Майн рид", "Всаднимк без головы", "Русский");
        father.PersonLibrary.AddBook("Дуглас", "Автостопом по галактике", "Русский");

        view.treeView(father, 1);
        father.Say();
    }
}
