public class Main {
    public static void main(String[] args){
        BookShelf bookshelf = new BookShelf(4);
        bookshelf.appendBook(new Book("Around the World in 80 Days"));
        bookshelf.appendBook(new Book("ABible"));
        bookshelf.appendBook(new Book("Cinderella"));
        bookshelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookshelf.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
