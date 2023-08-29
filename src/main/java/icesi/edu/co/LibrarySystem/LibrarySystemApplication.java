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

		// Create 3 books and add to service
		Book book1 = new Book("Book1", "Publisher1", "Author1");
		Book book2 = new Book("Book2", "Publisher2", "Author2");
		Book book3 = new Book("Book3", "Publisher3", "Author3");

		bookService.addBook(book1);
		bookService.addBook(book2);
		bookService.addBook(book3);

		// Retrieve and print book data using ID
		Long bookIdToRetrieve = book2.getId();
		Book retrievedBook = bookService.getBookById(bookIdToRetrieve);
		System.out.println("Retrieved Book: " + retrievedBook);

		// Delete a book using ID
		Long bookIdToDelete = book1.getId();
		bookService.deleteBook(bookIdToDelete);
		System.out.println("Book with ID " + bookIdToDelete + " deleted.");
	}
}
