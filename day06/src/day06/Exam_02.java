package day06;
import java.io.*;
import java.net.*;

public class Exam_02 {
	public static final int PORT = 12345;
	public static void main(String[] args) throws IOException{
		//�޴� ��
		
		byte[] by = new byte[65508];
		
		DatagramPacket dp = new DatagramPacket(by,65508);
		DatagramSocket ds = new DatagramSocket(PORT);
		
		ds.receive(dp);
		ds.close();
		
		
		InetAddress ia = dp.getAddress();
		String data = new String(dp.getData()).trim();
		
		System.out.println("�������� �ּ� : "+ia.getHostAddress());
		System.out.println("�������� �޼��� : "+ data);
		
		DatagramPacket dp2 =new DatagramPacket(data.getBytes(),data.getBytes().length,ia,PORT+1);
		ds.send(dp2);
		ds.close();
	}

}
