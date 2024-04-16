package chapter15.Input_Output;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public class Content01 implements Serializable { 
	// implements Serializable 는 아래 코드와는 관계 x
	
	public static void main(String[] args) {
		
		
		try {
			File f = new File("D:\\javaSeason01\\java_jungsuk_basic\\src\\chapter15\\Input_Output\\test.txt");
			System.out.println(f.getName()); // test.txt
			System.out.println(f.getAbsolutePath());
			System.out.println(f.getParent());
			
			// 먼저 스트림 생성
			FileInputStream fis = new FileInputStream(f);
			
			// 스트림을 이용해 보조스트림을 생성
			BufferedInputStream bis = new BufferedInputStream(fis);

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
