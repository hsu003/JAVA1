package part01.sec01.exam01;

import java.util.Scanner;

public class Problem04_02 {

	public static void main(String[] args) {    //자동 계산법
		Scanner s = new Scanner(System.in);
		
		int money,c500,c100,c50,c10;   //jo;
		
		System.out.print("## 교환할 돈은?");
		money=s.nextInt();
		//money=money-150;
	
		
		c500=money/500;
		money=money%500;
		
		c100=money/100;   
		money=money%100;
		
		c50=money/50;   
		money=money%50;
		
		c10=money/10;   
		money=money%10;
		
		
		System.out.printf("\n오백원 짜리 ==> %d개\n",c500);
		System.out.printf("백원 짜리 ==> %d개\n",c100);
		System.out.printf("오십원 짜리 ==> %d개\n",c50);
		System.out.printf("십원 짜리 ==> %d개\n",c10);
		System.out.printf("바꾸지 못한 잔돈 ==> %d개\n",money);
		//jo=c500+c100+c50+c10;
		//System.out.printf("잔돈은 ==> %개\n",jo);
		

		s.close();
	
	}

}
