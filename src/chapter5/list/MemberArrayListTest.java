package chapter5.list;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "Albert");
		Member memberKim = new Member(1002, "Jessie");
		Member memberKang = new Member(1003, "Eunju");
		Member memberHong = new Member(1004, "Inseop");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberKang);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.removeMember("Eunju");
		memberArrayList.showAllMember();
	}

}
