package part01.sec01.exam01;               //�޼ҵ带 �̿��Ͽ� ���Ǳ� �޼ҵ� �����

import java.util.Scanner;

public class Ex09_11 {
	
	//�޼ҵ�� �׻� ()�� ���� �Ѵ�.             (��ȯŸ��,�޼����,��ȣ())
	public static int coffee_machine(int button) {               //�������� �Ű� ������ �;� �Ѵ�.(�ܺηκ��� ���� ���� �޴´�.),�ɼ�
		System.out.println("\n#1.(�ڵ�����)�߰ſ� ���� �غ��Ѵ�.");
		System.out.println("#2. (�ڵ�����) �������� �غ��Ѵ�.");
		
		switch(button) {
		case 1:
			System.out.println("#3. (�ڵ�����)����Ŀ�Ǹ� ź��.");
			break;
		case 2:
			System.out.println("#3. (�ڵ�����)����Ŀ�Ǹ� ź��.");
			break;
		case 3:
			System.out.println("#3. (�ڵ�����)��Ŀ�Ǹ� ź��.");
			break;
		default:
			System.out.println("#3. (�ڵ�����)�ƹ��ų� ź��.");
			break;
		}
		System.out.println("#4. ���� �״´�.");
		System.out.println("#5. ��Ǭ���� ��� ���δ�.\n");
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int coffee,coffee1;
		int ret;
		
		System.out.println("� Ŀ�� �帱��� ? (1:����, 2:����, 3:��)");
		coffee = s.nextInt();
		
		ret =coffee_machine(coffee);
		System.out.println("�մ� ~~ Ŀ�� ���� �ֽ��ϴ�.");
		
		System.out.println("� Ŀ�� �帱��� ? (1:����, 2:����, 3:��)");
		coffee1 = s.nextInt();
		
		ret =coffee_machine(coffee1);
		System.out.println("�մ� ~~ Ŀ�� ���� �ֽ��ϴ�.");
		//System.out.println("ret="+ret);     //���ϰ� ���°� .
		
		s.close();

	}

}
