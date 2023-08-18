package com.ofss.main.service;

import java.util.List;

import com.ofss.main.domain.MemberDetails;

public interface MemberDetailsServiceInterface {
	public boolean addNewMember(MemberDetails MemberDetails);

	public MemberDetails getMemberByMemberCode(int MemberCode);

	public List<MemberDetails> allMembers();
}
