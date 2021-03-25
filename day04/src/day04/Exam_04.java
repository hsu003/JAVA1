package day04;

import java.io.*;

public class Exam_04 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		File dir = new File("D:\\java-emp-class-0406\\java-web\\day04");
		File file = new File(dir, "ccc.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Object obj = ois.readObject();
		
	}

	
}
