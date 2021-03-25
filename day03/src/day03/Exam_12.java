package day03;
import java.io.*;

public class Exam_12 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("File.separator = " + File.separator);
		System.out.println("File.separatorChar = " + File.separatorChar);
		System.out.println("File.pathSeparator = " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar = " + File.pathSeparatorChar);
		
		//File file = new File("d:"+File.separator+"java-web"+File.separator
		//		+"study"+File.separator+"day03"+File.separator+"aaa.txt");
		File dir = new File("d:"+File.separator+"java-web"
						+File.separator+"study"+File.separator+"day03");
		File file = new File(dir, "aaa.txt");
		/*
		String path = "D:\\java-web\\study\\day03";
		//windows는 폴더구별자가 \ , 리눅스의 폴더구별자는 /
		File file = new File(path+"\\aaa.txt");
		
		File file2 = new File(path, "aaa.txt");
		File dir = new File(path);
		File file3 = new File(dir, "aaa.txt");
		*/
		
	}
}
