package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Author;
import com.repo.AuthorRepo;

@Service
public class Authortask implements AuthorService {
	
	@Autowired
	private AuthorRepo authorRepo;

	@Override
	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		authorRepo.save(author);
	}

	@Override
	public Author getAuthor(Integer authorId) {
		// TODO Auto-generated method stub
		return authorRepo.getOne(authorId);
	}

	@Override
	public Author updateAuthor(Integer authorId, Author author) {
		// TODO Auto-generated method stub
		return authorRepo.save(author);
	}

	@Override
	public void deleteAuthor(Integer authorId) {
		// TODO Auto-generated method stub
		authorRepo.deleteById(authorId);
	}

	@Override
	public List<Author> getAllAuthors() {
		// TODO Auto-generated method stub
		List<Author> authors = authorRepo.findAll();
		return authors;
	}

}
