package prat01.sec01.exam01;      //구구단 가로 출력 2~9단

public class Ex06_15 {

	public static void main(String[] args) {
		int i;
		int k;

		for (i = 1; i <= 9; i++) {

			for (k = 2; k <= 9; k++) {
				System.out.printf("%3d X %d = %2d \t", k, i, k * i);

			}
			System.out.println(" ");
		}

	}

}
