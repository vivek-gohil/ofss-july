package com.ofss.main.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ofss.main.domain.BookDetails;
import com.ofss.main.domain.BookIssueDetails;
import com.ofss.main.domain.MemberDetails;

public class BookIssueDetailsRepository implements BookIssueDetailsRepositoryInterface {

	private List<BookIssueDetails> bookIssueDetailsList = new ArrayList<>();

	public BookIssueDetailsRepository() {
		// 3 BookDetails object
		BookDetails bookDetails1 = new BookDetails();
		bookDetails1.setBookCode(1);
		BookDetails bookDetails2 = new BookDetails();
		bookDetails2.setBookCode(2);
		BookDetails bookDetails3 = new BookDetails();
		bookDetails3.setBookCode(3);

		// 3 MemberDetails object
		MemberDetails memberDetails1 = new MemberDetails();
		memberDetails1.setMemberCode(1);
		MemberDetails memberDetails2 = new MemberDetails();
		memberDetails2.setMemberCode(2);
		MemberDetails memberDetails3 = new MemberDetails();
		memberDetails3.setMemberCode(3);

		// 3 BookIssueDetails object
		BookIssueDetails bookIssueDetails1 = new BookIssueDetails(1, new Date(), new Date(), bookDetails1,
				memberDetails1);
		BookIssueDetails bookIssueDetails2 = new BookIssueDetails(2, new Date(), new Date(), bookDetails2,
				memberDetails2);
		BookIssueDetails bookIssueDetails3 = new BookIssueDetails(3, new Date(), new Date(), bookDetails3,
				memberDetails3);

		bookIssueDetailsList.add(bookIssueDetails1);
		bookIssueDetailsList.add(bookIssueDetails2);
		bookIssueDetailsList.add(bookIssueDetails3);

	}

	@Override
	public boolean addNewBookIssue(BookIssueDetails bookIssueDetails) {
		return bookIssueDetailsList.add(bookIssueDetails);
	}

	@Override
	public BookIssueDetails getBookIssueByBookIssueCode(int bookIssueCode) {
		for (BookIssueDetails bookIssueDetails : bookIssueDetailsList) {
			if (bookIssueDetails.getBookIssueCode() == bookIssueCode)
				return bookIssueDetails;
		}
		return null;
	}

	@Override
	public List<BookIssueDetails> allBookIssues() {
		return bookIssueDetailsList;
	}

}
