package part01.sec01.exam01;

public class Problem09_03 {
	static int getNumber() {
		return (int) (Math.random() * 45) + 1;
	}

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int i, k, num;
		char dupl = 'N';

		System.out.printf(" ** �ζ� ��÷�� �����մϴ�. **\n\n");

		for (i = 0; i < 6; i++) {
			num = getNumber();
			for (k = 0; k < 6; k++)
				if (lotto[k] == num)
					dupl = 'Y';
			if (dupl == 'N') {
				lotto[i] = num;
			} else {
				dupl = 'N';
				i--; //i-- �� ������ ���� ���� �Ǿ� ���� �ʴ� i �� �ڸ��� �ٽ� for �� ������� �Ҹ�.ex.10,20,0 �϶� 3��° �ٽ� ����
			}
		}
		System.out.printf("��÷�� �ζ� ��ȣ ==> ");
		for (i = 0; i < 6; i++)

			System.out.printf("%d ", lotto[i]);

	}

}
