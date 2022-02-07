package chapter5.set;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("Kim"));
		hashSet.add(new String("Lee"));
		hashSet.add(new String("Hong"));
		hashSet.add(new String("Kang"));
		hashSet.add(new String("Chan"));
		
		System.out.println(hashSet);
		
		String k1 = new String("Kim");
		String k2 = "Kim";
		System.out.println(k1 == k2);
	}

}
