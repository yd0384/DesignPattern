public class BookShelf implements Aggregate{
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxSize){
        this.books = new Book[maxSize];
    }
    public Book getBookAt(int i){
        return books[i];
    }
    public void appendBook(Book book){
        books[last++] = book;
    }
    public int getLength(){
        return this.last;
    }
    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}
