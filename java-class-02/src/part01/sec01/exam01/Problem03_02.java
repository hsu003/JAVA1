package part01.sec01.exam01;

import java.util.Scanner;

public class Problem03_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int type=0,data=0;
		String str;
		
		
		System.out.printf("�Է����� ���� <1>10 <2>16 <3>8 :"); 
		type = s.nextInt();    //Scanner>>�޼ҵ�  next() �Լ� ���
			
		System.out.printf("�� �Է� : ");
		if(type==1) {
			str = s.next();
			data = Integer.parseInt(str,10);  // Integer.parseInt �Էµ� ���� 10������ �ٱ��.
		}
		
		if(type==2) {
			str = s.next();
			data = Integer.parseInt(str,16);  // Integer.parseInt �Էµ� ���� 10������ �ٱ��.
		}
		
		if(type==3) {
			str = s.next();
			data = Integer.parseInt(str,8);  // Integer.parseInt �Էµ� ���� 8������ �ٱ��.
		}
		
		
		
	
		System.out.printf("10���� ==>%d\n", data);
		System.out.printf("16���� ==>%X\n", data);
		System.out.printf("8���� ==>%o\n", data);
		
		
		s.close();

	}

}
