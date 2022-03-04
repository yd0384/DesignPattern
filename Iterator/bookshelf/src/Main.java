public class Main{
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
        BookShelfArrayList bookshelf2 = new BookShelfArrayList();
        bookshelf2.appendBook(new Book("Around the World in 80 Days"));
        bookshelf2.appendBook(new Book("ABible"));
        bookshelf2.appendBook(new Book("Cinderella"));
        bookshelf2.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it2 = bookshelf2.iterator();
        while(it2.hasNext()){
            Book book = (Book)it2.next();
            System.out.println(book.getName());
        }
    }
}
