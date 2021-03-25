package prat01.sec01.exam02;

public class SalesRevenue {

	public static void main(String[] args) {
		int intArray[][] = { { 90, 90, 110, 110 }, { 120, 110, 100, 110 }, { 120, 140, 130, 150 } };
		double sum = 0;
		int i, k;

		for (i = 0; i < intArray.length; i++) { // 첫번째 랭스는 첫번째 행의 길이
			for (k = 0; k < intArray[i].length; k++) { // 두번째 랭스는 두번째 행의 열의 길이
				sum += intArray[i][k];
			}

		}
		System.out.println("지난 3년간 매출 총액은" + sum + "이며 연평균 매출은" + sum / intArray.length + "입니다. ");
	}

}
