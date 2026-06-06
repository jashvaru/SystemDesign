package LLD.DesignPatterns.BehaviouralDesignPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public IteratorP<Book> cretaIteratorP() {
        return new BookIterator(books);
    }

    public class BookIterator implements IteratorP<Book> {

        private List<Book> books = new ArrayList<>();
        private int position = 0;

        public BookIterator(List<Book> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
           return position < books.size();
        }

        @Override
        public Book next() {
            return books.get(position++);
        }
    
    }


}
