package prat01.sec01.exam02;      //for���� 3���� �Ἥ �ܰ� �������� ǥ�� �ϴ� ���.

public class Problem06_01 {

	public static void main(String[] args) {
		int i;
		int k;
		
		for (i = 2; i <= 9; i++) {      //ó�� ó���ϴ� for������ ó�� �Է��� ���� ���� �ϰ� ������ for���� ������ ����
			System.out.printf(" #�� %d��# \t", i);
            
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
