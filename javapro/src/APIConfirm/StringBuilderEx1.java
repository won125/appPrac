package APIConfirm;

public class StringBuilderEx1 {

	public static void main(String[] args) {
		String str = "";
		for(int i=1;i<=100;i++) {
			str+=i;
		}
		System.out.println(str);
		//개선코드
		StringBuilder sd = new StringBuilder();
		for(int i=1;i<=100;i++) {
			sd.append(i);
		}
		str = sd.toString();
		System.out.println(str);

	}

}
