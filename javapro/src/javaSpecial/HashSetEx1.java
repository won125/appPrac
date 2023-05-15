package javaSpecial;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("java");
		set1.add("html");
		set1.add("css");
		set1.add("react");
		System.out.println("총 객체수 : "+ set1.size());
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) { //객체의 존재 여부 확인
			String subject = iter.next(); // iter 객체에서 한 개의 자료를 가져온다.
			System.out.println(subject);
		}

	}

}
