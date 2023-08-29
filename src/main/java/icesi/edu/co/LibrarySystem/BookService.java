package icesi.edu.co.LibrarySystem;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class BookService {
    private final Map<Long, Book> bookMap = new HashMap<>();
    private long nextId = 1;

    public Book addBook(Book book) {
        book.setId(nextId++);
        bookMap.put(book.getId(), book);
        return book;
    }

    public Book getBookById(Long id) {
        return bookMap.get(id);
    }

    public void deleteBook(Long id) {
        bookMap.remove(id);
    }
}
