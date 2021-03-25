package day06;
import java.io.*;
import java.net.*;

public class Exam_01 {
	public static final int PORT = 12345;
	public static void main(String[] args) throws IOException {
		//보내는 쪽
		String data = "Hello,  java!!";
		byte[] by = data.getBytes();
		
		InetAddress ia = InetAddress.getByName("localhost");
		
		DatagramPacket dp = new DatagramPacket(by,by.length,ia,PORT);
		DatagramSocket ds = new DatagramSocket(PORT+1);
		
		ds.send(dp);
		ds.close();
		
		DatagramPacket dp2 = new DatagramPacket(new byte[65508],65508);
		ds.receive(dp2);
		ds.close();
		
		InetAddress ia2 = dp.getAddress();
		String data2 = new String(dp.getData()).trim();
		
		System.out.println("보낸이의 주소 : "+ia2.getHostAddress());
		System.out.println("보낸이의 메세지 : "+ data2);

	}

}
