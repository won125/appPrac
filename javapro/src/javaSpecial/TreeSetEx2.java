package javaSpecial;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet<String> tree1 = new TreeSet<String>();
		tree1.add("apple");
		tree1.add("bit");
		tree1.add("zoo");
		tree1.add("forever");
		tree1.add("banana");
		tree1.add("cherry");
		tree1.add("melody");
		System.out.println("b~f 사이의 단어 검색");
		NavigableSet<String> rangeSet = tree1.subSet("b", true, "g", true);
		for(String word : rangeSet) {
			System.out.println(word);
		}

	}

}
