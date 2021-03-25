package prat01.sec01.exam01;

public class Ex07_05 {

	public static void main(String[] args) {
		int a=100;
		
		while(a==200) {
			System.out.println("while문 내부에 들어 있습니다.");
		}
		do {
			System.out.println("do ~ while문 내부에 들어 있습니다.");
		}
		while(a==200);      //while 문의 마지막은 ; 를 반드시 찍어야 한다/

	}

}
