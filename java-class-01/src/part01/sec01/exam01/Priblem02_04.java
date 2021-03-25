package part01.sec01.exam01;

import java.io.IOException;

public class Priblem02_04 {

	public static void main(String[] args)throws IOException {
		
		// Reyboard를 통하여 입력
		// System.in.read()==> 아스키코드(문자하나)
		
		System.out.print("입력 : ");   //줄을 바꾸지 않는다.
		// 엔터키를 누를때 아스키코드 13번(carriage return)
		// 입력되고 개행이 될 때 10번 (new Line)이 입력된다.
		// System.in.read()-48 또는 '0'
		// int num,=Ststem.in.read()-'0';  num은 내가지정하는 변수
		// (char)System.in.read();==> 2byte 문자로 처리
		int num1=System.in.read();
		System.out.println("출력 : "+num1);
		System.in.read();      //원하고자 하는 입력값
		System.in.read();     //시스템 인 리드가 두번인 이유는 엔터 까지가 문자로 포함되어서 엔터를 읽기 위해서
		
		System.out.print("입력 : ");
		int num2=System.in.read()-48;
		System.out.println("출력 : "+num2);
		System.in.read();
		System.in.read();
		
		System.out.print("입력 : ");
		char cha=(char)System.in.read();
		System.out.println("출력 : "+cha);
				
		
	}

}
