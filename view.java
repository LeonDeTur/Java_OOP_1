public class view {
    public static void treeView(Person root, int num){
        String line = "  ".repeat(num);
        line = line + "|" + "_".repeat(num);
        System.out.println((line) + root.name);
        for (Person a: root.GetListName()){
            treeView(a, num + 1);
        }
    }
}
