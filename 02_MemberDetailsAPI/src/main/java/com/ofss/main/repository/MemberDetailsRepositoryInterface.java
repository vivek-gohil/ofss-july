package com.ofss.main.repository;

import java.util.List;

import com.ofss.main.domain.MemberDetails;

public interface MemberDetailsRepositoryInterface {
	public boolean addNewMember(MemberDetails MemberDetails);

	public MemberDetails getMemberByMemberCode(int MemberCode);

	public List<MemberDetails> allMembers();

	
}
