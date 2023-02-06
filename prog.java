public class prog {
    public static void main(String[] args) {
        Person dad = new Person("Alex");
        Person son = new Person("Leon");
        Person daugter = new Person("Emma");
        Person graddaughter = new Person("Molly");
        dad.AddName(son);
        dad.AddName(daugter);
        daugter.AddName(graddaughter);
        view.treeView(dad, 1);
    }
}
