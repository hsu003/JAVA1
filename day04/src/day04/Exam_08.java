package day04;
import java.io.*;
import java.net.*;

public class Exam_08 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket soc = null;
		BufferedReader in = null;
		PrintWriter pw = null;
		try {
			ss = new ServerSocket(12345);
			System.out.print("서버 대기중......");
			soc = ss.accept();
			in = new BufferedReader(new InputStreamReader
									(soc.getInputStream()));
			String msg = in.readLine();
			pw = new PrintWriter(new BufferedWriter
					(new OutputStreamWriter(soc.getOutputStream())));
			pw.println(msg);
			pw.close();
			soc.close();
		}catch(Exception e) {}
		
	}
}
