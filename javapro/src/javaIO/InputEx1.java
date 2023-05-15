package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputEx1 {

	public static void main(String[] args) {
		File dir = new File("C:/taewon_kim/javaproject/file");
		File infoFile = new File("C:/taewon_kim/javaproject/file/info.txt");
		if(dir.exists()==false) {
			dir.mkdir();
			System.out.println("폴더가 생성되었습니다.");
		}else {
			System.out.println("이미 폴더가 존재합니다.");
		}
		try {
			FileInputStream fileIS = new FileInputStream(infoFile);
			byte[] readBytes = new byte[fileIS.available()];
			fileIS.read(readBytes);
			String str = new String(readBytes);
			System.out.println(str);
			fileIS.close();
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}

	}

}
