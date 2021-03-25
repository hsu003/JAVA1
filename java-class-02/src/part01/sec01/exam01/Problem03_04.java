package part01.sec01.exam01;

import java.util.Scanner;

public class Problem03_04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;   //문자열   
		int i;
		
		
		System.out.print("문자열을 입력 ==>");
		str = s.nextLine();   //문자열 입력, 엔터키를 문자열 끝으로 인식
		
		for(i = str.length() - 1; i>=0;i--){    //엔터키를 포함한 글자수
		System.out.printf("%c", str.charAt(i));  
		}

		System.out.printf("\n");    
		System.out.println();
		
		
		s.close();
	}

}
