package com.ofss.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.main.domain.BookDetails;
import com.ofss.main.service.BookDetailsService;
import com.ofss.main.service.BookDetailsServiceInterface;

@RestController
@RequestMapping("bookdetailsapi")
public class BookDetailsController {

	private BookDetailsServiceInterface bookDetailsServiceInterface = new BookDetailsService();

	@RequestMapping(value = "bookdetails", method = RequestMethod.GET)
	public List<BookDetails> getAllBooks() {
		return bookDetailsServiceInterface.allBooks();
	}

	@RequestMapping(value = "bookdetails/{bookCode}", method = RequestMethod.GET)
	public BookDetails getSingleBook(@PathVariable int bookCode) {
		return bookDetailsServiceInterface.getBookByBookCode(bookCode);
	}

	@RequestMapping(value = "bookdetails", method = RequestMethod.POST)
	public boolean addNewBook(@RequestBody BookDetails bookDetails) {
		return bookDetailsServiceInterface.addNewBook(bookDetails);
	}
}
