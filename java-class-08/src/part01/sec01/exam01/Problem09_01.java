package part01.sec01.exam01;

import java.util.Scanner;

import javax.swing.Spring;

public class Problem09_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		String tt="";
		int i,k;
		
		
		System.out.printf("���ڿ��� �Է��ϼ��� : ");
		str = s.nextLine();
		
		k=str.length();
		
		
		for(i=0;i<k;i++)
			tt+=str.charAt(k-(i+1));
		/*
		 * for(i = k-1 ; i >= 0 ; i--) 
		 * tt+=str.charAt(i);
		 */
			System.out.printf("������ �Ųٷ� ��� ==> %s\n", tt);
			
			s.close();
					
		}

}
