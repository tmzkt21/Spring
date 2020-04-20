package com.occamsrazor.web.member;

public interface MemberService {

	public void add(Member member);
	public Member[] list();
	public Member[] searchByname(String name);
	public Member[] searchBygender(String gender);
	public int count();
	public int count(String name);
	public void update(Member member);
	public void delete(Member member);
	
}
