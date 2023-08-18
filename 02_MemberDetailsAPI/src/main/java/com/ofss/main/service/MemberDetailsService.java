package com.ofss.main.service;

import java.util.List;

import com.ofss.main.domain.MemberDetails;
import com.ofss.main.repository.MemberDetailsRepository;
import com.ofss.main.repository.MemberDetailsRepositoryInterface;

public class MemberDetailsService implements MemberDetailsServiceInterface {

	private MemberDetailsRepositoryInterface memberDetailsRepositoryInterface = new MemberDetailsRepository();

	@Override
	public boolean addNewMember(MemberDetails memberDetails) {
		return memberDetailsRepositoryInterface.addNewMember(memberDetails);
	}

	@Override
	public MemberDetails getMemberByMemberCode(int memberCode) {
		return memberDetailsRepositoryInterface.getMemberByMemberCode(memberCode);
	}

	@Override
	public List<MemberDetails> allMembers() {
		return memberDetailsRepositoryInterface.allMembers();
	}

}
