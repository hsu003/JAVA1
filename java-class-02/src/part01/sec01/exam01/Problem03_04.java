package part01.sec01.exam01;

import java.util.Scanner;

public class Problem03_04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;   //���ڿ�   
		int i;
		
		
		System.out.print("���ڿ��� �Է� ==>");
		str = s.nextLine();   //���ڿ� �Է�, ����Ű�� ���ڿ� ������ �ν�
		
		for(i = str.length() - 1; i>=0;i--){    //����Ű�� ������ ���ڼ�
		System.out.printf("%c", str.charAt(i));  
		}

		System.out.printf("\n");    
		System.out.println();
		
		
		s.close();
	}

}
