package prat01.sec01.exam01;

public class Ex07_09 {    //브레이크 반복문 빠저 나가는 법

	public static void main(String[] args) {
		int i, hap = 0;
		// for,hap,if,break;

		for (i = 1 ; i < 100; i++) {
			hap = hap + i;
			
			if (hap >= 1000) 
				break;			
		}

		System.out.printf("1 ~ 100의 합에서 최초로 1000이 넘는 값은? : %d \n", i);
		
	}

}
