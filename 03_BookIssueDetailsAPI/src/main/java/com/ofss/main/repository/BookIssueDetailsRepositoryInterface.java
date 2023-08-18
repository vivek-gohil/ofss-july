package com.ofss.main.repository;

import java.util.List;

import com.ofss.main.domain.BookIssueDetails;

public interface BookIssueDetailsRepositoryInterface {
	
	public boolean addNewBookIssue(BookIssueDetails bookIssueDetails);

	public BookIssueDetails getBookIssueByBookIssueCode(int bookIssueCode);

	public List<BookIssueDetails> allBookIssues();

}
