package part01.sex01.exam02;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a;
		
		System.out.printf("���� �Է��Ͻÿ� : ");
		a = s.nextInt();
		
		if(a%3==0) {                  //a��/3�� ������ �������� 0�̸� 3�� ��� ��ó��
			System.out.printf("3�� ����Դϴ�.");
		}
		
		else{
			System.out.printf("3�� ����� �ƴմϴ�.");
		}
		
		s.close();

	}

}
