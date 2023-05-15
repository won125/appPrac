package APIConfirm;

import java.util.StringTokenizer;

public class SplitEx1 {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		//split()메서드
		String[] strs = str.split(",");
		for(String i:strs) {
			System.out.println(i);
		}
		System.out.println();
		//StringTokenizer매서드
		StringTokenizer st = new StringTokenizer(str,",");
		int count = st.countTokens();
		for(int i =0;i<count;i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
