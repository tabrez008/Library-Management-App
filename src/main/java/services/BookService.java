package services;

import java.util.List;

import com.model.Book;


public interface BookService {
	public void addBook(Book book);

	public Book getBook(int bookId);

	public Book updateBook(int BookId,Book book);

	public void deleteBook(int bookId);

	public List<Book> getAllBooks();
}
