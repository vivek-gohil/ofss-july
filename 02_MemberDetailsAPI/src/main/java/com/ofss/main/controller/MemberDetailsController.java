package com.ofss.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.main.domain.MemberDetails;
import com.ofss.main.service.MemberDetailsService;
import com.ofss.main.service.MemberDetailsServiceInterface;

@RestController
@RequestMapping("memberdetailsapi")
public class MemberDetailsController {

	private MemberDetailsServiceInterface memberDetailsServiceInterface = new MemberDetailsService();

	@RequestMapping(value = "memberdetails", method = RequestMethod.GET)
	public List<MemberDetails> getAllMembers() {
		return memberDetailsServiceInterface.allMembers();
	}

	@RequestMapping(value = "memberdetails/{memberCode}", method = RequestMethod.GET)
	public MemberDetails getSingleMember(@PathVariable int memberCode) {
		return memberDetailsServiceInterface.getMemberByMemberCode(memberCode);
	}

	@RequestMapping(value = "memberdetails", method = RequestMethod.POST)
	public boolean addNewMember(@RequestBody MemberDetails memberDetails) {
		return memberDetailsServiceInterface.addNewMember(memberDetails);
	}
}
