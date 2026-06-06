package LLD.DesignPatterns.BehaviouralDesignPatterns.IteratorPattern;

public class Client {

    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("C++"));    
        bookCollection.addBook(new Book("Java"));

        IteratorP<Book> iteratorP = bookCollection.cretaIteratorP();
        while (iteratorP.hasNext()) {
            System.out.println(iteratorP.next().toString());
        }
    }

    
    
}
