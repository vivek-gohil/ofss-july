package com.ofss.main.repository;

import java.util.ArrayList;
import java.util.List;

import com.ofss.main.domain.BookDetails;

public class BookDetailsRepository implements BookDetailsRepositoryInterface {

	private List<BookDetails> bookDetailsList = new ArrayList<>();

	public BookDetailsRepository() {
		bookDetailsList.add(new BookDetails(1, "Java", "Oracle", 10, 5, true));
		bookDetailsList.add(new BookDetails(2, "C++", "AT&T", 10, 5, true));
		bookDetailsList.add(new BookDetails(3, "C#", "Microsoft", 10, 5, true));
		bookDetailsList.add(new BookDetails(4, "Python", "Vivek Gohil", 10, 5, true));
		bookDetailsList.add(new BookDetails(5, "JavaScript", "W3C", 10, 5, true));
	}

	@Override
	public boolean addNewBook(BookDetails bookDetails) {
		return bookDetailsList.add(bookDetails);
	}

	@Override
	public BookDetails getBookByBookCode(int bookCode) {
		for (BookDetails bookDetails : bookDetailsList) {
			if (bookDetails.getBookCode() == bookCode)
				return bookDetails;
		}
		return null;
	}

	@Override
	public List<BookDetails> allBooks() {
		return bookDetailsList;
	}


}
