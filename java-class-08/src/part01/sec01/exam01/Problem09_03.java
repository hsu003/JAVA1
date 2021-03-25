package part01.sec01.exam01;

public class Problem09_03 {
	static int getNumber() {
		return (int) (Math.random() * 45) + 1;
	}

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int i, k, num;
		char dupl = 'N';

		System.out.printf(" ** 로또 추첨을 시작합니다. **\n\n");

		for (i = 0; i < 6; i++) {
			num = getNumber();
			for (k = 0; k < 6; k++)
				if (lotto[k] == num)
					dupl = 'Y';
			if (dupl == 'N') {
				lotto[i] = num;
			} else {
				dupl = 'N';
				i--; //i-- 은 데이터 값이 저장 되어 있지 않는 i 의 자리로 다시 for 을 돌리라는 소리.ex.10,20,0 일때 3번째 다시 리턴
			}
		}
		System.out.printf("추첨된 로또 번호 ==> ");
		for (i = 0; i < 6; i++)

			System.out.printf("%d ", lotto[i]);

	}

}
