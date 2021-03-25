package day03;
import java.io.*;
public class Exam_16 {
	public static void main(String[] args) throws IOException {
		File dir = new File("d:"+File.separator+"java-emp-class-0406"
				+File.separator+"java-web"+File.separator+"day03");
		File file = new File(dir, "bbb.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeUTF("ȫ�浿");
		dos.writeInt(100);
		dos.writeInt(90);
		dos.writeDouble(95.0);
		
		//dos.flush();
		dos.close();//flush() + close()
		
	}
}	
