package day03;
class A08 extends Thread{
	
	public void run() {
		System.out.println("A08클래스가 시작되었습니다.!!");
		System.out.println("A08 스레드 상태 : " + Thread.currentThread());
	}
}

class B08 extends Object implements Runnable{

	@Override
	public void run() {
		System.out.println("B08클래스가 시작되었습니다.!!");
	}
}

public class Exam_08 {
	public static void main(String[] args) {
		System.out.println("main메소드가 실행되었습니다.");
		System.out.println("main스레드 상태 " + Thread.currentThread());
		
		A08 ap = new A08();
		ap.setName("A08클래스");
		ap.setPriority(10);
		ap.start();
		/*
		B08 ap = new B08();
		Thread th = new Thread(ap);
		th.start();
		/*
		/*A08 ap = new A08();
		ap.start();
		for(int i=1; i<=100; ++i) {
			System.out.print(i +"\t");
			if (i%10==0) System.out.println();
		}*/
		System.out.println("main메소드가 끝났습니다.");
	}
}




