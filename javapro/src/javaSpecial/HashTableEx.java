package javaSpecial;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("hong", "12345");
		map.put("kim", "11111");
		map.put("young", "22222");
		map.put("son", "77777");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("================================");
			System.out.println();
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("ID >> ");
			String id = sc.next();
			System.out.print("Password >> ");
			String password = sc.next();
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 성공!!!");
					break;
				}else {
					System.out.println("입력하신 아이디의 비밀번호와 다릅니다.");
				}
			}else {
				System.out.println("입력하닌 아이디가 존재하지 않습니다.");
			}
		}

	}

}
