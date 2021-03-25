package day06;
import java.io.*;
import java.net.*;

public class Exam_02 {
	public static final int PORT = 12345;
	public static void main(String[] args) throws IOException{
		//받는 곳
		
		byte[] by = new byte[65508];
		
		DatagramPacket dp = new DatagramPacket(by,65508);
		DatagramSocket ds = new DatagramSocket(PORT);
		
		ds.receive(dp);
		ds.close();
		
		
		InetAddress ia = dp.getAddress();
		String data = new String(dp.getData()).trim();
		
		System.out.println("보낸이의 주소 : "+ia.getHostAddress());
		System.out.println("보낸이의 메세지 : "+ data);
		
		DatagramPacket dp2 =new DatagramPacket(data.getBytes(),data.getBytes().length,ia,PORT+1);
		ds.send(dp2);
		ds.close();
	}

}
