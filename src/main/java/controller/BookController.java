package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Book;

import net.minidev.json.JSONObject;
import services.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/list_books" , method = RequestMethod.GET, headers="Accept= application/json")
	public@ResponseBody ResponseEntity<Object> getListBooks() {
		
		List<Book> listBooks=bookService.getAllBooks();
		
		List<JSONObject> books = new ArrayList<JSONObject>();
		
	    for (Book b: listBooks) {
	        JSONObject book = new JSONObject();
	        book.put("ID", b.getBID());
	        book.put("BOOK_NAME", b.getBookName());
	        book.put("PUBLISHED_YEAR", b.getPublishedYear());
	        book.put("PUBLISHER", b.getPublisher());
	        book.put("STATUS", b.getStatus());
	        
	        books.add(book);
	    }
		return new ResponseEntity<Object>(books,HttpStatus.OK);
		

	}
	
	@RequestMapping(value="/add_books" , method = RequestMethod.POST, headers="Accept= application/json")
	public ResponseEntity<Book> addBooks(@RequestBody Book book){
		
		bookService.addBook(book);
		HttpHeaders header=new HttpHeaders();
		
		return new ResponseEntity<Book>(header,HttpStatus.CREATED);

	}
}
