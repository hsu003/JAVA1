package day04;
import java.io.*;
public class Exam_01 {

	public static void main(String[] args) throws IOException{
		File dir = new File("D:\\java-emp-class-0406\\java-web\\day04");
		File file = new File(dir, "aaa.txt");
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw, 1024);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("�ڹ�");
		pw.println("�����ð��Դϴ�.");
		pw.println("���� ������ ");
		pw.println("80 �Դϴ�.");
		
		pw.close();

	}

}
