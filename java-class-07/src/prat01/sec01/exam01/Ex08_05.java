package prat01.sec01.exam01;

public class Ex08_05 {

	public static void main(String[] args) {//100���� �迭 aa�� 0, 2, 4, 8, ��(2�� ���)�� �ʱ�ȭ�� ����, �迭 bb�� �������� �ֱ�
		int[] aa = new int[100];
		int[] bb = new int[200];
		int i;  //���̺��� 
		
		for(i = 0; i < 100; i++) {
			aa[i]=i*2;				
		}
		
		for(i = 0; i< 100;i++) {
			bb[i]= aa[99-i];
		}
		System.out.printf("bb[0]�� %d, bb[99]�� %d �Էµ� \n",bb[0],bb[99]);
		

	}

}
