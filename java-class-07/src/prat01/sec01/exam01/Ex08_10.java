package prat01.sec01.exam01;

import java.util.Scanner;

public class Ex08_10 {

	public static void main(String[] args) { // ���ǰ����� ��� �� �߰��Ͽ� �� ��� �ϴ°�
		Scanner s = new Scanner(System.in);
		int row, col;
		int i, k;
		int val = 1;

		System.out.printf("�� ������ �Է� ");
		row = s.nextInt();
		System.out.printf("�� ������ �Է� ");
		col = s.nextInt();

		int[][] aa = new int[row][col];

		for (i = 0; i < row; i++) {
			for (k = 0; k < col; k++) {
				aa[i][k] = val++;
				//val++;

			}
		}
		System.out.printf("aa[0][0] ���� aa[%d][%d] ���� ���\n", row, col);
		for (i = 0; i < row; i++) {
			for (k = 0; k < col; k++) {

				System.out.printf("%3d", aa[i][k]);
			}
			System.out.println(" ");
		}

		s.close();
	}

}
