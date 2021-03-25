package day04;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Exam_07 {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		InetAddress ia = null;//ip주소를 관리하는 클래스
		Socket soc = null;
		PrintWriter pw;
		Scanner s= new Scanner(System.in);
		try {
			ia = InetAddress.getByName("192.168.0.42");
			//자기자신을 표현 : localhost, 127.0.0.1, 192.168.0.200
			soc = new Socket(ia, 12345);
			System.out.println("서버 접속 성공!!");
			pw = new PrintWriter(new BufferedWriter
						(new OutputStreamWriter(soc.getOutputStream())));
			
			pw.println("java network programming!!");
			pw.close();
			soc.close();
		}catch(UnknownHostException e) {
			System.err.println("해당 주소는 접속할 수 없습니다.");
		}catch(IOException e) {
			System.err.println("서버 접속 오류 발생!!");
		}
		
		System.out.println("클라이언트 끝!!");
		
	}
}
