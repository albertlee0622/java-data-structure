package chapter5.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private List<Member> arrayList;

	public MemberArrayList() {
		super();
		this.arrayList = new ArrayList<Member>();
	}
	
	public MemberArrayList(int capacity) {
		super();
		this.arrayList = new ArrayList<Member>(capacity);
	}
	
	public void addMember(Member newMember) {
		arrayList.add(newMember);
	}
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			if(arrayList.get(i).getMemberId() == memberId) {
				arrayList.remove(i);
				return true;
			} 	
		}
		return false;
	}
	
	public boolean removeMember(String memberName) {
		Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			if(member.getMemberName().equals(memberName)) {
				arrayList.remove(member);
				return true;
			}
		}
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
	}

}
