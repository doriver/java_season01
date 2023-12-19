package iostream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath = ".\\file\\exam1.txt";
		//C:\\Users\\main\\eclipse-workspace\\Java_Basic
		

//		FileWriter fw = new FileWriter(filePath);
//		fw.write("첫번째 문장\r\n");
//		fw.write("두번째 문장\r\n");
//		fw.close();
		
		FileWriter fww = new FileWriter(filePath, true);
		fww.write("추가됐나?");
		fww.close();
		
		
	}

}
