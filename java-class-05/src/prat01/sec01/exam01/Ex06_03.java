package prat01.sec01.exam01;

public class Ex06_03 {

	public static void main(String[] args) {
		int i;
		//int j;
		//int k;
		
		for(i = 0 ; i < 3 ; i++) {    //for의 변수는 for을 제어 해주는 변수   다른곳에서 사용이 불가능 하다.
			System.out.println("안녕하세요?");
			System.out.println("##반갑습니다.##");
		}
		
		System.out.printf("\n\n");
		
		/*
		 * for(i = 0 ; i < 3 ; i++) 
		 * { System.out.println("안녕하세요?");
		 * System.out.println("##반갑습니다.##");
		 * 
		 * for(j = 0 ; j < 3 ; j++) 
		 * { System.out.println("안녕하세요?");
		 * System.out.println("##반갑습니다.##"); }
		 * 
		 * for(k = 0 ; k < 3 ; k++) 
		 * { System.out.println("안녕하세요?");
		 * System.out.println("##반갑습니다.##"); }
		 */
		for(i = 0 ; i < 3 ; i++) { 
			System.out.println("안녕하세요?");
		    System.out.println("##반갑습니다.##");
		}
	}

}
