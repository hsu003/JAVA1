package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_09 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a;
		
		System.out.print("1 ~ 4 �߿� �����ϼ��� :");
		a = s.nextInt();
		
		switch(a) {       //ǥ�� ����ġ ĳ�̽���  ()�ȿ��� ���� ������ �� ����
		case 1:           //���̽� ������ ���� �����ϰ��� �ϴ� ���� ���� ex: 1��1
			System.out.println("1�� �����ߴ�.");
			break;          //�ش� ���� ������ �귡��ũ�� �ɾ �ؿ� ���������� �������� �ʰ� �Ѵ�.
		case 2:
			System.out.println("2�� �����ߴ�.");
			break;
		case 3:
			System.out.println("3�� �����ߴ�.");
			break;
		case 4:
			System.out.println("4�� �����ߴ�.");
			break;
		default :
			System.out.println("�̻��� �� �����ߴ�.");
		}
		s.close();

	}

}
