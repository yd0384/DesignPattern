public class BookShelfArrayListIterator implements Iterator {
    private BookShelfArrayList bookShelf;
    private int index;
    public BookShelfArrayListIterator(BookShelfArrayList bookShelf){
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
