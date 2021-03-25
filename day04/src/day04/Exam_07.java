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
		InetAddress ia = null;//ip�ּҸ� �����ϴ� Ŭ����
		Socket soc = null;
		PrintWriter pw;
		Scanner s= new Scanner(System.in);
		try {
			ia = InetAddress.getByName("192.168.0.42");
			//�ڱ��ڽ��� ǥ�� : localhost, 127.0.0.1, 192.168.0.200
			soc = new Socket(ia, 12345);
			System.out.println("���� ���� ����!!");
			pw = new PrintWriter(new BufferedWriter
						(new OutputStreamWriter(soc.getOutputStream())));
			
			pw.println("java network programming!!");
			pw.close();
			soc.close();
		}catch(UnknownHostException e) {
			System.err.println("�ش� �ּҴ� ������ �� �����ϴ�.");
		}catch(IOException e) {
			System.err.println("���� ���� ���� �߻�!!");
		}
		
		System.out.println("Ŭ���̾�Ʈ ��!!");
		
	}
}
