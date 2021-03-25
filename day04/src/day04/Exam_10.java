package day04;
import java.io.*;
import java.net.*;
import java.util.*;

@SuppressWarnings("unused")
class ChatServer extends Thread{
	ServerSocket ss;
	Socket soc;
	Scanner key;
	PrintWriter pw;
	BufferedReader br;
	
	public ChatServer() throws IOException {
		//보내는 프로그램 작성
		ss = new ServerSocket(12345);
		System.out.println("서버 대기중 .....");
		soc = ss.accept();
		key = new Scanner(System.in);
		//pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
		pw = new PrintWriter(soc.getOutputStream(), true);
		this.start();   //받는 프로그램 실행!!
		while(true){
			String msg = key.nextLine();
			if(msg == null)break;
			pw.println(msg);
			pw.flush();
		}
	}
	public void run() {
		//받는 프로그램을 작성
		try {
			br = new BufferedReader(new InputStreamReader(
					soc.getInputStream()));
			while(true) {
				String msg = br.readLine();
				System.out.println("클에게 온 메세지 : "+msg);
			}
		}catch(IOException e) {
			
		}
	}
}
@SuppressWarnings("unused")
public class Exam_10 {

	public static void main(String[] args) throws IOException {
		new ChatServer();
	}

}
