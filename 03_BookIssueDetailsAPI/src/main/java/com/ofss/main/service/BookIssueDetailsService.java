package com.ofss.main.service;

import java.util.List;

import com.ofss.main.domain.BookIssueDetails;
import com.ofss.main.repository.BookIssueDetailsRepository;
import com.ofss.main.repository.BookIssueDetailsRepositoryInterface;

public class BookIssueDetailsService implements BookIssueDetailsServiceInterface {

	private BookIssueDetailsRepositoryInterface bookIssueDetailsRepositoryInterface = new BookIssueDetailsRepository();

	@Override
	public boolean addNewBookIssue(BookIssueDetails bookIssueDetails) {
		return bookIssueDetailsRepositoryInterface.addNewBookIssue(bookIssueDetails);
	}

	@Override
	public BookIssueDetails getBookIssueByBookIssueCode(int bookIssueCode) {
		return bookIssueDetailsRepositoryInterface.getBookIssueByBookIssueCode(bookIssueCode);
	}

	@Override
	public List<BookIssueDetails> allBookIssues() {
		return bookIssueDetailsRepositoryInterface.allBookIssues();
	}


}
