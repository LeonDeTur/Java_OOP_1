public class prog {
    public static void main(String[] args) {
        Person dad = new Person("Alex");
        Person son = new Person("Leon");
        Person daugter = new Person("Emma");
        Person granddaughter = new Person("Molly");
        Person grandson = new Person("Alexander");
        dad.AddName(son);
        dad.AddName(daugter);
        son.AddName(grandson);
        daugter.AddName(granddaughter);
        view.treeView(dad, 1);
    }
}
