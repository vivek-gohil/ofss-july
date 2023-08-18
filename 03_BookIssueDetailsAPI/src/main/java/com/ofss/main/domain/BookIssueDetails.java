package com.ofss.main.domain;

import java.util.Date;

public class BookIssueDetails {
	private int bookIssueCode;
	private Date issueDate;
	private Date returnDate;
	private BookDetails bookDetails;
	private MemberDetails memberDetails;

	public BookIssueDetails() {
		// TODO Auto-generated constructor stub
	}

	public BookIssueDetails(int bookIssueCode, Date issueDate, Date returnDate, BookDetails bookDetails,
			MemberDetails memberDetails) {
		super();
		this.bookIssueCode = bookIssueCode;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.bookDetails = bookDetails;
		this.memberDetails = memberDetails;
	}

	public int getBookIssueCode() {
		return bookIssueCode;
	}

	public void setBookIssueCode(int bookIssueCode) {
		this.bookIssueCode = bookIssueCode;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public BookDetails getBookDetails() {
		return bookDetails;
	}

	public void setBookDetails(BookDetails bookDetails) {
		this.bookDetails = bookDetails;
	}

	public MemberDetails getMemberDetails() {
		return memberDetails;
	}

	public void setMemberDetails(MemberDetails memberDetails) {
		this.memberDetails = memberDetails;
	}

	@Override
	public String toString() {
		return "BookIssueDetails [bookIssueCode=" + bookIssueCode + ", issueDate=" + issueDate + ", returnDate="
				+ returnDate + ", bookDetails=" + bookDetails + ", memberDetails=" + memberDetails + "]";
	}

}
