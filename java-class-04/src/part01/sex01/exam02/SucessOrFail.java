package part01.sex01.exam02;

import java.util.Scanner;

public class SucessOrFail {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a;
		
		System.out.printf("������ �Է��Ͻÿ� : ");
		a=s.nextInt();
		
		if(a>=80) {              //
			System.out.printf("�����մϴ�! �հ��Դϴ�.\n");
		}
		
		if(a<80) {
			System.out.printf("���հ��Դϴ�.\n");
		}
		
		s.close();

	}

}
