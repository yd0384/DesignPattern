public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
    }
    public boolean hasNext(){
        if(index == this.bookShelf.getLength()){
            return false;
        }
        return true;
    }
    public Object next(){
        return bookShelf.getBookAt(index++);
    }
}
