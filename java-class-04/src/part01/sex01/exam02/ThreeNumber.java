package part01.sex01.exam02;

import java.util.Scanner;

public class ThreeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a1,b2,c3;
		//int e;     //� ���ڰ� ���� �𸣴� a�� ���� ū ���ڸ� �ְڴٶ�� �������� ����
		
		System.out.printf("ù��° ������ �Է��ϼ���: ");
		a1=s.nextInt();
		System.out.printf("�ι�° ������ �Է��ϼ���: ");
		b2=s.nextInt();
		System.out.printf("����° ������ �Է��ϼ���: ");
		c3=s.nextInt();
		
		                                //30     50     20 �̶�� �����ϸ�
		                                // ���� ū���� a1�� �ֱ�
		if(b2>a1 && b2>=c3) {      //b�� a��c���� ũ��
	      int  e=a1;                  // {�ȿ��� ������ ������ {}�ȿ����� ��� �����ϴ�
	        a1=b2;                  //�Ѱ��� ���� Ȯ�����Ѽ� ������ �����Ѵ�
	        b2=e;
		}		
		else if(c3>a1 && c3>=b2) {
			int e=a1;
			a1=c3;
			c3=e;	
		}
		else if(c3>b2) {            //�ι�° ū���� b2�� �ֱ�
			int e=b2;
			    b2=c3;
			    c3=e;
		
			
		}
		System.out.printf("%d >= %d >= %d\n",a1,b2,c3);
			
		s.close();
		

	}

}
