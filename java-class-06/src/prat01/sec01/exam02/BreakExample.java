package prat01.sec01.exam02;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         int num=0;
                 
         while(true) {     //-1�� �ԷµǸ� �ݺ� ����
         			
 			if(s.nextInt() == -1) 
 				break;
 			num++;
        	 
         }
         System.out.println("�Էµ� ���� ������ "+num);
s.close();
	}

}
