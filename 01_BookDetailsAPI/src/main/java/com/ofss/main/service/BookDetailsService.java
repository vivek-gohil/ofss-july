package com.ofss.main.service;

import java.util.List;

import com.ofss.main.domain.BookDetails;
import com.ofss.main.repository.BookDetailsRepository;
import com.ofss.main.repository.BookDetailsRepositoryInterface;

public class BookDetailsService implements BookDetailsServiceInterface {

	private BookDetailsRepositoryInterface bookDetailsRepositoryInterface = new BookDetailsRepository();

	@Override
	public boolean addNewBook(BookDetails bookDetails) {
		return bookDetailsRepositoryInterface.addNewBook(bookDetails);
	}

	@Override
	public BookDetails getBookByBookCode(int bookCode) {
		return bookDetailsRepositoryInterface.getBookByBookCode(bookCode);
	}

	@Override
	public List<BookDetails> allBooks() {
		return bookDetailsRepositoryInterface.allBooks();
	}
}
