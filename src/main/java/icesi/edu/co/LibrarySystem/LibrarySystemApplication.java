package icesi.edu.co.LibrarySystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LibrarySystemApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LibrarySystemApplication.class, args);

		// Access the BookService bean
		BookService bookService = context.getBean(BookService.class);

		// Create 3 books
		Book book1 = new Book("Book1", "Publisher1", "Author1");
		Book book2 = new Book("Book2", "Publisher2", "Author2");
		Book book3 = new Book("Book3", "Publisher3", "Author3");

		// Add books
		bookService.addBook(book1);
		bookService.addBook(book2);
		bookService.addBook(book3);

		// Retrieve and print book data using ID
		Book retrievedBook = bookService.getBookById(book2.getId());
		System.out.println("Retrieved Book: " + retrievedBook);

		// Delete a book using ID
		bookService.deleteBook(book1.getId());
		System.out.println("Book deleted.");

		// Try to retrieve the deleted book
		Book deletedBook = bookService.getBookById(book1.getId());
		System.out.println("Deleted Book: " + deletedBook); // This will be null
	}
}
