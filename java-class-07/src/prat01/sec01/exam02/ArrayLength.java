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
			sum+= intArray[i];       //두가지 방법 다 가능하다.
			}
		//for(i = 0 ; i < intArray.length ;i++) {
			//sum +=  intArray[i];
			
		//}
		System.out.println("배열 원소의 평균은" + sum/intArray.length + "입니다.");
		s.close();

	}

}
