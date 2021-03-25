package prat01.sec01.exam02;      //for문을 3개를 써서 단과 구구단은 표현 하는 방식.

public class Problem06_01 {

	public static void main(String[] args) {
		int i;
		int k;
		
		for (i = 2; i <= 9; i++) {      //처음 처리하는 for문으로 처음 입력할 값을 지정 하고 나머지 for으로 수식을 정리
			System.out.printf(" #제 %d단# \t", i);
            
		}
		System.out.printf("\n\n");
		for (i = 1; i <= 9; i++) {

			for (k = 2; k <= 9; k++) {
				System.out.printf("%2d X%2d =%2d\t", k, i, k * i);

			}
			System.out.println("\n");
		}

	}
}
