package com.ofss.main.service;

import java.util.List;

import com.ofss.main.domain.BookIssueDetails;

public interface BookIssueDetailsServiceInterface {
	public boolean addNewBookIssue(BookIssueDetails bookIssueDetails);

	public BookIssueDetails getBookIssueByBookIssueCode(int bookIssueCode);

	public List<BookIssueDetails> allBookIssues();

}
