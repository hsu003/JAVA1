package part01.sec01.exam01;   //�ܼ� ����ġ ��� Ŀ�� �����

import java.util.Scanner;

public class Ex09_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int coffee;
		
		System.out.print("� Ŀ�� �帱���? (1:����, 2:��Ż, 3:��)");
		coffee= s.nextInt();
		
		System.out.println("\n#1. �߰ſ� ���� �غ��Ѵ�.");
		System.out.println("#2. �������� �غ��Ѵ�.");
		
		
		switch(coffee) {
		case 1:
			System.out.println("#3. ����Ŀ�Ǹ� ź��.");
			break;
		case 2:
			System.out.println("#3. ����Ŀ�Ǹ� ź��.");
			break;
		case 3:
			System.out.println("#3. ��Ŀ�Ǹ� ź��.");
			break;
		default:
			System.out.println("#3. �ƹ��ų� ź��.");
			break;
			
		}
		
		System.out.println("#4. ���� �״´�.");
		System.out.println("#5. ��Ǭ���� ��� ���δ�.\n");
		
		System.out.println("�մ� ~~~ Ŀ�� ���� �ֽ��ϴ�.");
		
		s.close();	

	}

}
