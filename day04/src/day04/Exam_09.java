package day04;

import java.io.*;
import java.net.*;
import java.util.*;

public class Exam_09 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		InetAddress ia = null;
		Socket soc = null;
		Scanner in = new Scanner(System.in);
		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			ia = InetAddress.getByName("localhost");
			soc = new Socket(ia, 12345);
			System.out.print("서버로 보낼 메세지 : ");
			String msg = in.next();
			pw = new PrintWriter(new BufferedWriter
					(new OutputStreamWriter(soc.getOutputStream())));
			pw.println(msg);
			pw.flush();
			br = new BufferedReader(new InputStreamReader
										(soc.getInputStream()));
			String msg2 = br.readLine();
			System.out.println("서버에서 온 메세지 : "+ msg2);
			br.close();
			soc.close();
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}





