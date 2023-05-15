package javaAPI;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		String text = "È«±æµ¿,±èÃ¶¼ö#¹ÚÂùÈ£,ÀÌ¿µÈñ&¹ÚÁö¼º";
		StringTokenizer st = new StringTokenizer(text,",|&|#");
		int tokens = st.countTokens();
		/*
		 for(int i=0;i<tokens;i++) {
		 	String str = st.nextToken();
			System.out.println(str);
		}
		*/
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println(str);
		}

	}

}
