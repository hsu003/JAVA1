package day03;

import java.text.*;
class A09 extends Thread{
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	public void run() {
		while(true) {
			java.util.Date date = new java.util.Date();
			System.out.println(sdf.format(date));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
public class Exam_09 {
	public static void main(String[] args) {
		A09 ap = new A09();
		ap.setDaemon(true);//�������α�(main�� ����� ��Ƽ�����嵵 ����)
		ap.start();
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
	}
}














