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
			System.out.println("서버 대기중......");
			soc = ss.accept();
			while(true) {
				System.out.println("접속자 정보 : " + soc.toString());
				br = new BufferedReader(new InputStreamReader
										(soc.getInputStream()));
				String msg = br.readLine();
				System.out.println("전송된 내용 : " + msg);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
