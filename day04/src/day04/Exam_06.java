package day04;
import java.net.*;
import java.io.*;

public class Exam_06 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket soc = null;
		BufferedReader br = null;
		try {
			ss = new ServerSocket(12345);
			System.out.println("���� �����......");
			soc = ss.accept();
			while(true) {
				System.out.println("������ ���� : " + soc.toString());
				br = new BufferedReader(new InputStreamReader
										(soc.getInputStream()));
				String msg = br.readLine();
				System.out.println("���۵� ���� : " + msg);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
