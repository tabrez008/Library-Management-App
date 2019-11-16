package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Book;
import com.repo.BookRepo;
@Service
public class BookTask implements BookService {
	@Autowired
	private BookRepo bookrepo;
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookrepo.save(book);
	}

	@Override
	public Book getBook(int bookId) {
		// TODO Auto-generated method stub
		return bookrepo.getOne(bookId);
	}

	@Override
	public Book updateBook(int BookId, Book book) {
		// TODO Auto-generated method stub
		return bookrepo.save(book);
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		bookrepo.deleteById(bookId);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books = bookrepo.findAll();
		
		return books;
	}

}
