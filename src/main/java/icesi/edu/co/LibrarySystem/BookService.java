package icesi.edu.co.LibrarySystem;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookService {
    private final Map<Long, Book> bookMap = new HashMap<>();

    public void addBook(Book book) {
        book.setId(generateId());
        bookMap.put(book.getId(), book);
    }

    public Book getBookById(Long id) {
        return bookMap.get(id);
    }

    public void deleteBook(Long id) {
        bookMap.remove(id);
    }

    private Long generateId() {
        return bookMap.keySet().stream().max(Long::compareTo).orElse(0L) + 1;
    }
}
