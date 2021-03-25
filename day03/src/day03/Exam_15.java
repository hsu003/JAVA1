package day03;
import java.io.*;


public class Exam_15 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File dir = new File("d:"+File.separator+"java-emp-class-0406"
				+File.separator+"java-web"+File.separator+"day03");
		File file = new File(dir, "aaa.txt");
		
		FileInputStream fis = new FileInputStream(file);
		
		while(true) {
			int a = fis.read();
			if (a == -1) break;//EOF : end of file
			System.out.print((char)a);
		}
	}
}
