package part01.sex01.exam02;

import java.util.Scanner;

public class Problem05_03 {

	
	public static void main(String[] args) {
		int user,com;
		
		System.out.printf("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.\n");
		
		Scanner s= new Scanner(System.in);
		String tmp = s.nextLine();       //ȭ���� ���� �Է¹��� ������ tmp�� ����
	    user = Integer.parseInt(tmp);
	                                     //�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		com = (int) ((Math.random()*3)+1);
		
		System.out.printf("����� "+ user +" �Դϴ�.\n");
		System.out.printf("��ǻ���� "+ com + " �Դϴ�.\n");
			
		
		switch (user - com) {
		case 2:
		case -1:
		System.out.printf("����� �����ϴ�. \n");
		break;
		case 1:
		case -2:
		System.out.printf("����� �̰���ϴ�. \n");
		break;
		case 0:
		System.out.printf("�����ϴ�.\n");
	    break;
		}
		

		s.close();
	}

}
