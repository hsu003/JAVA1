package prat01.sec01.exam02;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int intArray[] = new int[5];
		double sum=0;
		int i;
		
		for(i = 0 ; i <intArray.length ;i++ ) {
			intArray[i]=s.nextInt();
			sum+= intArray[i];       //�ΰ��� ��� �� �����ϴ�.
			}
		//for(i = 0 ; i < intArray.length ;i++) {
			//sum +=  intArray[i];
			
		//}
		System.out.println("�迭 ������ �����" + sum/intArray.length + "�Դϴ�.");
		s.close();

	}

}
