package javaIO;

import java.io.File;
import java.io.FileOutputStream;

public class OutputEx1 {

	public static void main(String[] args) {
		File saveFile = new File("C:/taewon_kim/javaproject/file/save.txt");
		try {
			FileOutputStream fileOS = new FileOutputStream(saveFile);
			String memo = "내용이 저장됩니다. 이 파일저장 수업이 끝나면 자바구현 수업 시작";
			fileOS.write(memo.getBytes());
			fileOS.close();
			System.out.println("save.txt 파일이 저장되었습니다.");
		} catch (Exception e) {
			System.out.println("파일을 저장할 수 없습니다.");
		}

	}

}
