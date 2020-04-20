package com.occamsrazor.web.member;

public class MemberServiceImpl implements MemberService{

	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
	}
	
	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}
	@Override
	public Member[] list() {
		
		return members;
	}
	@Override
	public Member[] searchByname(String name) {
		Member[] retrunname = null;
		int searchcount = count(name);
		if (searchcount != 0) {
			retrunname = new Member[searchcount];
		}
		int j = 0;
		for (int i = 0; i < count; i++) {
			if (name.equals(members[i].getName())) {
				
				retrunname[j] = members[i];
			}
		}
		return retrunname;
	}
	@Override
	public Member[] searchBygender(String gender) {
		
		return null;
	}
	@Override
	public int count() {
		
		return count;
	}
	@Override
	public int count(String name) {
		int returncount = 0;
		for (int i = 0; i < count; i++) {
			if (name.equals(members[i].getName())) {
				returncount++;
			}
		}
		
		return returncount;
	}
	@Override
	public void update(Member member) {
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())) {
			members[i].setPassword(member.getPassword());
			}
		}
	}
	@Override
	public void delete(Member member) {
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())&& member.getPassword().equals(members[i].getPassword())) {
				members[i] = members[count-1];
				members[count-1] = null;
				count--;
			}
		}
		
	}
}
