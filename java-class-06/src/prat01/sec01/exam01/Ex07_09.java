package prat01.sec01.exam01;

public class Ex07_09 {    //�극��ũ �ݺ��� ���� ������ ��

	public static void main(String[] args) {
		int i, hap = 0;
		// for,hap,if,break;

		for (i = 1 ; i < 100; i++) {
			hap = hap + i;
			
			if (hap >= 1000) 
				break;			
		}

		System.out.printf("1 ~ 100�� �տ��� ���ʷ� 1000�� �Ѵ� ����? : %d \n", i);
		
	}

}
