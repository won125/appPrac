package javaSpecial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("±æµ¿","Ã¶¼ö","¿µÈñ");
		for(String name : list) {
			System.out.println(name);
		}
		
		List<Integer> nums = Arrays.asList(10,20,30,40,50,60);
		for(int num : nums) {
			System.out.println(num);
		}

	}

}
