package javaSpecial;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		// 
		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.put(35,"apple");
		tree1.put(10,"bit");
		tree1.put(35,"zoo");
		tree1.put(99,"forever");
		tree1.put(12,"banana");
		tree1.put(2,"cherry");
		tree1.put(7,"melody");
		Map.Entry<Integer, String> entry = null;
		entry = tree1.firstEntry();
		System.out.println("가장 낮은 번호 : " + entry.getKey() + " : " + entry.getValue());
		entry = tree1.lastEntry();
		System.out.println("가장 높은 번호 : " + entry.getKey() + " : " + entry.getValue());

	}

}
