package part01.sec01.exam01;

import java.util.Scanner;

public class Ex09_03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		
		System.out.print("문자열 입력==>");
		str=s.nextLine();
		System.out.print("문자열 출력==>");
		
		if(!str.startsWith("("))  //특정 문자 또는 문자열로 시작
			System.out.printf("(");
		for(int i=0;i<str.length();i++)
			System.out.printf("%c",str.charAt(i));
		if(!str.endsWith(")"))
			System.out.printf(")");
				
		s.close();
	}

}
