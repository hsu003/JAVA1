package prat01.sec01.exam02;

public class SalesRevenue {

	public static void main(String[] args) {
		int intArray[][] = { { 90, 90, 110, 110 }, { 120, 110, 100, 110 }, { 120, 140, 130, 150 } };
		double sum = 0;
		int i, k;

		for (i = 0; i < intArray.length; i++) { // ù��° ������ ù��° ���� ����
			for (k = 0; k < intArray[i].length; k++) { // �ι�° ������ �ι�° ���� ���� ����
				sum += intArray[i][k];
			}

		}
		System.out.println("���� 3�Ⱓ ���� �Ѿ���" + sum + "�̸� ����� ������" + sum / intArray.length + "�Դϴ�. ");
	}

}
