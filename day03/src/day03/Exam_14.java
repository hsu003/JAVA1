package day03;
import java.io.*;

public class Exam_14 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File dir = new File("d:"+File.separator+"java-emp-class-0406"
				+File.separator+"java-web"+File.separator+"day03");
		File file = new File(dir, "aaa.txt");
		
		//파일에 byte단위로 저장하기
		FileOutputStream fos = new FileOutputStream(file);
		
		String msg = "diidi";
		
		byte[] by = msg.getBytes();
		
		fos.write(by);
		//fos.write('B');
	}
}

