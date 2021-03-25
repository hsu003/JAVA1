package prat01.sec01.exam01;

import java.util.Scanner;

public class Ex08_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] aa = new int[4];
		int hap=0;
		int i;
		
		
		for(i=0;i<=3;i++) {
			System.out.printf("%d 번째 숫자를 입력 하세요 :",i+1);
			aa[i]=s.nextInt();
		
				//hap=aa[0]+aa[1]+aa[2]+aa[3];
			hap=hap+aa[i];
		}
		System.out.printf("합계 ==> %d\n",hap);
		
		
		s.close();
		}	
	}

