package chapter5.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberHashSet {
	private Set<Member> memberSet;

	public MemberHashSet() {
		super();
		this.memberSet = new HashSet<Member>();
	}
	
	public void addMember(Member memberLee) {
		memberSet.add(memberLee);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> iterator = memberSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			if(member.getMemberName().equals(memberId)) {
				memberSet.remove(member);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeMember(String memberName) {
		Iterator<Member> iterator = memberSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			if(member.getMemberName().equals(memberName)) {
				memberSet.remove(member);
				return true;
			}
		}
		return false;
	}
	
	public void showAllMember() {
		for(Member member : memberSet) {
			System.out.println(member);
		}
	}

}
