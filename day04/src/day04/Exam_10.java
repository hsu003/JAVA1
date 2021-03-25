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
		//������ ���α׷� �ۼ�
		ss = new ServerSocket(12345);
		System.out.println("���� ����� .....");
		soc = ss.accept();
		key = new Scanner(System.in);
		//pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
		pw = new PrintWriter(soc.getOutputStream(), true);
		this.start();   //�޴� ���α׷� ����!!
		while(true){
			String msg = key.nextLine();
			if(msg == null)break;
			pw.println(msg);
			pw.flush();
		}
	}
	public void run() {
		//�޴� ���α׷��� �ۼ�
		try {
			br = new BufferedReader(new InputStreamReader(
					soc.getInputStream()));
			while(true) {
				String msg = br.readLine();
				System.out.println("Ŭ���� �� �޼��� : "+msg);
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
