import java.util.List ;
import java.util.ArrayList;
public class BookShelfArrayList implements Aggregate{
    private List<Book> books;
    public BookShelfArrayList(){
        books = new ArrayList<>();
    }
    public Book getBookAt(int i){
        return books.get(i);
    }
    public void appendBook(Book book){
        books.add(book);
    }
    public int getLength(){
        return books.size();
    }
    public Iterator iterator(){
        return new BookShelfArrayListIterator(this);
    }
}