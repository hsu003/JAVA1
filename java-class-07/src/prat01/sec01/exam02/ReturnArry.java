package prat01.sec01.exam02;

public class ReturnArry {

	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray(); // ȣ��
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

	public static int[] makeArray() {       //����Ÿ�� �迭�� ���� ��ų ��� []�� ������ �迭 Ÿ���̶�� ���� ���ش�.
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
			                     //�տ��� �迭�� �̹� ���� �߱⶧���� ���ѹ� []�� ���ĵ�  �迭�� �ν� �Ѵ�.
		}
		return temp;      //������ ������ �Ǵ� �����ִ�
	}

}
