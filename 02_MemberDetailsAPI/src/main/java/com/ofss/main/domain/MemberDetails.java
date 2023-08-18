package com.ofss.main.domain;

public class MemberDetails {
	private int memberCode;
	private String firstName;
	private String lastName;
	private String memberType;
	private int contactNumber;
	private String email;
	private boolean memberStatus;

	public MemberDetails() {
		// TODO Auto-generated constructor stub
	}

	public MemberDetails(int memberCode, String firstName, String lastName, String memberType, int contactNumber,
			String email, boolean memberStatus) {
		super();
		this.memberCode = memberCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.memberType = memberType;
		this.contactNumber = contactNumber;
		this.email = email;
		this.memberStatus = memberStatus;
	}

	public int getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(int memberCode) {
		this.memberCode = memberCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(boolean memberStatus) {
		this.memberStatus = memberStatus;
	}

	@Override
	public String toString() {
		return "MemberDetails [memberCode=" + memberCode + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", memberType=" + memberType + ", contactNumber=" + contactNumber + ", email=" + email
				+ ", memberStatus=" + memberStatus + "]";
	}

}
