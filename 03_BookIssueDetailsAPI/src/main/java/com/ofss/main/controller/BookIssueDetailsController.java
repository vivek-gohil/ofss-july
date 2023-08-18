package com.ofss.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ofss.main.domain.BookDetails;
import com.ofss.main.domain.BookIssueDetails;
import com.ofss.main.domain.MemberDetails;
import com.ofss.main.service.BookIssueDetailsService;
import com.ofss.main.service.BookIssueDetailsServiceInterface;

@RestController
@RequestMapping("bookIssuedetailsapi")
public class BookIssueDetailsController {

	private BookIssueDetailsServiceInterface bookIssueDetailsServiceInterface = new BookIssueDetailsService();

	@Autowired
	@LoadBalanced
	private RestTemplate restTemplate;

	@RequestMapping(value = "bookIssuedetails", method = RequestMethod.GET)
	public List<BookIssueDetails> getAllBookIssues() {
		List<BookIssueDetails> listBookIssueDetails = bookIssueDetailsServiceInterface.allBookIssues();

		for (BookIssueDetails bookIssueDetails : listBookIssueDetails) {
			int bookCode = bookIssueDetails.getBookDetails().getBookCode();
			BookDetails bookDetails = restTemplate
					.getForObject("http://bookdetails-api/bookdetailsapi/bookdetails/" + bookCode, BookDetails.class);
			int memberCode = bookIssueDetails.getMemberDetails().getMemberCode();
			MemberDetails memberDetails = restTemplate.getForObject(
					"http://memberdetails-api/memberdetailsapi/memberdetails/" + memberCode, MemberDetails.class);
			bookIssueDetails.setBookDetails(bookDetails);
			bookIssueDetails.setMemberDetails(memberDetails);
		}

		return listBookIssueDetails;
	}

	@RequestMapping(value = "bookIssuedetails/{bookIssueCode}", method = RequestMethod.GET)
	public BookIssueDetails getSingleBookIssue(@PathVariable int bookIssueCode) {
		return bookIssueDetailsServiceInterface.getBookIssueByBookIssueCode(bookIssueCode);
	}

	@RequestMapping(value = "bookIssuedetails", method = RequestMethod.POST)
	public boolean addNewBookIssue(@RequestBody BookIssueDetails bookIssueDetails) {
		return bookIssueDetailsServiceInterface.addNewBookIssue(bookIssueDetails);
	}
}
