package prat01.sec01.exam02;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         int num=0;
                 
         while(true) {     //-1이 입력되면 반복 종료
         			
 			if(s.nextInt() == -1) 
 				break;
 			num++;
        	 
         }
         System.out.println("입력된 숫자 개수는 "+num);
s.close();
	}

}
