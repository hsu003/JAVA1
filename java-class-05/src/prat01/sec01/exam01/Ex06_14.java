package prat01.sec01.exam01;      //구구단 세로 출력 만들기  2~9단

public class Ex06_14 {

	public static void main(String[] args) {
		
		int i;
		int k;
		
		for(i=2;i<=9;i++) {
			System.out.printf("%d몇단 입니다.\n",i);
			
			for(k=1;k<=9;k++) {
				System.out.printf("%d X %d = %d\n",i,k,i*k);
				
		}
			

	}
	
	}

}
