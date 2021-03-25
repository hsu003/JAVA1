package prat01.sec01.exam02;

import java.util.Scanner;

public class Problem06_03 {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String str;
			int str_cnt;
			int i;
			
			
			System.out.print("문자열을 입력 :");
			str = s.nextLine(); 
			
			System.out.printf("\n"); 
			System.out.printf("입력한 문자열 ==> %s \n",str); 
			System.out.printf("변환되는 문자열 ==> ");
			
			str_cnt = str.length();
			
			for(i = str_cnt - 1; i >= 0; i--){   
			System.out.printf("%c", str.charAt(i));
			
			}
			
			s.close();

	}

}
