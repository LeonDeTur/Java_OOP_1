import java.util.ArrayList;

public abstract class  Book {
    private String author;
    private String bookName;
    private String language;

    public void SetAuthor(String author){
        this.author = author;
    }

    public void SetBookName(String bookName){
        this.bookName = bookName;
    } 

    public void SetLanguage(String language){
        this.language = language;
    }

    public String GetAuthor(){
        return author;
    }

    public String GetBookName(){
        return bookName;
    }

    public String GetLanguage(){
        return language;
    }

    ArrayList<Book> listBook = new ArrayList<>();

    public void AddBook(Book book){
        listBook.add(book);
    }

    public ArrayList<Book> GetBookList(){
        return listBook;
    }
}
