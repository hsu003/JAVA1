package prat01.sec01.exam02;

public class Problem06_02 { // null 눈에는 안보이지만 아스키코드 0인 문자

	public static void main(String[] args) {
		int i;

		for (i = 0; i <= 127; i++) {

			if (i % 16== 0) {
				System.out.printf("------------------\n");
				System.out.printf("10십진수   16진수   문자 \n");
				System.out.printf("------------------\n");
			}
			System.out.printf("%5d %5x %5c \n", i, i, i);
		}

	}

}