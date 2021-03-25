package day04;

import java.io.*;


public class Exam_02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File dir = new File("D:\\java-emp-class-0406\\java-web\\day04");
		File file = new File(dir, "aaa.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;   //text 입력에서의 EOF 는 null  이다.
			}
			System.out.println(str);
		}
	}

}
