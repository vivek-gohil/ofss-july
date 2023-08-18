package com.ofss.main.domain;

public class BookDetails {
	private int bookCode;
	private String title;
	private String author;
	private int totalCopies;
	private int availableCount;
	private boolean isIssuable;

	public BookDetails() {
		// TODO Auto-generated constructor stub
	}

	public BookDetails(int bookCode, String title, String author, int totalCopies, int availableCount,
			boolean isIssuable) {
		super();
		this.bookCode = bookCode;
		this.title = title;
		this.author = author;
		this.totalCopies = totalCopies;
		this.availableCount = availableCount;
		this.isIssuable = isIssuable;
	}

	public int getBookCode() {
		return bookCode;
	}

	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getTotalCopies() {
		return totalCopies;
	}

	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
	}

	public int getAvailableCount() {
		return availableCount;
	}

	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}

	public boolean isIssuable() {
		return isIssuable;
	}

	public void setIssuable(boolean isIssuable) {
		this.isIssuable = isIssuable;
	}

	@Override
	public String toString() {
		return "BookDetails [bookCode=" + bookCode + ", title=" + title + ", author=" + author + ", totalCopies="
				+ totalCopies + ", availableCount=" + availableCount + ", isIssuable=" + isIssuable + "]";
	}

}
