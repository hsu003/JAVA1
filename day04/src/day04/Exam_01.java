package day04;
import java.io.*;
public class Exam_01 {

	public static void main(String[] args) throws IOException{
		File dir = new File("D:\\java-emp-class-0406\\java-web\\day04");
		File file = new File(dir, "aaa.txt");
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw, 1024);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("자바");
		pw.println("수업시간입니다.");
		pw.println("국어 점수는 ");
		pw.println("80 입니다.");
		
		pw.close();

	}

}
