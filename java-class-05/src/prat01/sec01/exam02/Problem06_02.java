package prat01.sec01.exam02;

public class Problem06_02 { // null ������ �Ⱥ������� �ƽ�Ű�ڵ� 0�� ����

	public static void main(String[] args) {
		int i;

		for (i = 0; i <= 127; i++) {

			if (i % 16== 0) {
				System.out.printf("------------------\n");
				System.out.printf("10������   16����   ���� \n");
				System.out.printf("------------------\n");
			}
			System.out.printf("%5d %5x %5c \n", i, i, i);
		}

	}

}