package com.ofss.main.service;

import java.util.List;

import com.ofss.main.domain.BookDetails;

public interface BookDetailsServiceInterface {
	public boolean addNewBook(BookDetails bookDetails);

	public BookDetails getBookByBookCode(int bookCode);

	public List<BookDetails> allBooks();
}
