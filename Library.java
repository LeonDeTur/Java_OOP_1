import java.util.ArrayList;

class LibraryBook{
    public String author;
    public String bookNAme;
    public String language;
}

public class Library extends Book{

    public String LibraryName;

    public Book(String libraryName){
        this.LibraryName = libraryName;
    }

    ArrayList<Book> listBook = new ArrayList<>();

    public void AddBook(String author, String bookName, String language){
        LibraryBook lb = new LibraryBook();
        SetAuthor(author);
        SetBookName(bookName);
        SetLanguage(language);
        lb.author = GetAuthor();
        lb.bookName = GetBookName();
        lb.language = GetLanguage();
        listBook.add(lb);
    }

    public ArrayList<Book> GetBookList(){
        return listBook;
    }
}
