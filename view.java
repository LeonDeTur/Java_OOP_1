public class view {
    public static void treeView(Person root, int num){
        String line = "  ".repeat(num);
        line = line + "|" + "_".repeat(num);
        System.out.println((line) + root.GetName());
        for (Person a: root.GetListName()){
            treeView(a, num + 1);
        }
    }

    public static void BookView(Persona root){
        System.out.println(root.GetBookName());
        for (LibraryBook a: root.LibraryName.PersonLibrary){
            System.out.println(a.author + " " + a.bookNAme);
        }
    }
}


