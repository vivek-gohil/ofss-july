package com.ofss.main.repository;

import java.util.ArrayList;
import java.util.List;

import com.ofss.main.domain.MemberDetails;

public class MemberDetailsRepository implements MemberDetailsRepositoryInterface {

	List<MemberDetails> memberDetailsList = new ArrayList<>();

	public MemberDetailsRepository() {
		memberDetailsList
				.add(new MemberDetails(1, "Vivek", "Gohil", "Faculty", 1234567, "ghl_vivek@hotmail.com", true));
		memberDetailsList.add(
				new MemberDetails(2, "Trupti", "Acharekar", "Student", 1234567, "trupti.acharekar@gmail.com", true));
		memberDetailsList
				.add(new MemberDetails(3, "Samarth", "Patil", "Student", 1234567, "samarth.patil@gmail.com", true));
		memberDetailsList
				.add(new MemberDetails(4, "Advait", "Gohil", "Student", 1234567, "advait.gohil@hotmail.com", true));
		memberDetailsList
				.add(new MemberDetails(5, "Gurubux", "Gill", "Student", 1234567, "gurubux.gill@hotmail.com", true));

	}

	@Override
	public boolean addNewMember(MemberDetails memberDetails) {
		return memberDetailsList.add(memberDetails);
	}

	@Override
	public MemberDetails getMemberByMemberCode(int memberCode) {
		for (MemberDetails memberDetails : memberDetailsList) {
			if (memberDetails.getMemberCode() == memberCode) {
				return memberDetails;
			}
		}
		return null;
	}

	@Override
	public List<MemberDetails> allMembers() {
		return memberDetailsList;
	}

}
