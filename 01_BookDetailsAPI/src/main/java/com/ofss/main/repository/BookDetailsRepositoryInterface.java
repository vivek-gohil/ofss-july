package com.ofss.main.repository;

import java.util.List;

import com.ofss.main.domain.BookDetails;

public interface BookDetailsRepositoryInterface {
	public boolean addNewBook(BookDetails bookDetails);

	public BookDetails getBookByBookCode(int bookCode);

	public List<BookDetails> allBooks();

}
