package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_06 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a;
		
		System.out.println("������ �Է��ϼ���:\n");
		a = s.nextInt();
		
		if(a%2==0) {
			System.out.println("¦���� �Է� �߱���.");
		}
		
		else {
			System.out.println("Ȧ���� �Է� �߱���.");
		
		}
		
		s.close();

	}

}
