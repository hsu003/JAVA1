package day03;
import java.io.*;

public class Exam_17 {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws IOException{
		File dir = new File("d:"+File.separator+"java-emp-class-0406"
				+File.separator+"java-web"+File.separator+"day03");
		File file = new File(dir, "bbb.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String name = dis.readUTF();
		int kor = dis.readInt();
		int eng = dis.readInt();
		double avg = dis.readDouble();
		
		System.out.println(name+"¥‘¿« ∆Ú±’¿∫ " + avg+"¡° ¿‘¥œ¥Ÿ.");
	}
}
