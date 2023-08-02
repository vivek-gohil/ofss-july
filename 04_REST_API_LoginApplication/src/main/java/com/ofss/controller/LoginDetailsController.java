package com.ofss.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.domain.LoginDetails;
import com.ofss.repository.LoginDetailsRepository;

@RestController
@RequestMapping("logindetailsapi")
public class LoginDetailsController {

	private LoginDetailsRepository loginDetailsRepository = new LoginDetailsRepository();

	@RequestMapping(value = "logindetails", method = RequestMethod.GET)
	public ResponseEntity<List<LoginDetails>> allLoginDetails() {
		List<LoginDetails> loginDetailsList = loginDetailsRepository.getAllLoginDetails();
		if (loginDetailsList.size() > 0) {
			return new ResponseEntity<List<LoginDetails>>(loginDetailsList, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<LoginDetails>>(HttpStatus.NO_CONTENT);
		}
	}

	@RequestMapping(value = "logindetails", method = RequestMethod.POST)
	public LoginDetails validateLoginDetails(@RequestBody LoginDetails loginDetails) {
		return loginDetailsRepository.getLoginDetails(loginDetails);
	}

	@RequestMapping(value = "logindetails", method = RequestMethod.PUT)
	public LoginDetails resetStatusCount(@RequestBody LoginDetails loginDetails) {
		return loginDetailsRepository.updateLoginDetails(loginDetails);
	}
}
