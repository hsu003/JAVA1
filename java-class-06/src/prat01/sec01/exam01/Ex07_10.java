package prat01.sec01.exam01;

public class Ex07_10 {

	public static void main(String[] args) {
		int hap=0;
		int i;
		for(i = 1 ; i<100 ; i++) {
			
			if(i % 3 == 0) 
				continue;   //3�� ����� ���� �ϸ� �ȵɶ� ���� ��ɾ�      
				hap=hap+i;      //return   ������ ���� ��Ű�� ��ɾ�
			
			
		}
		System.out.printf("1~100������ ��(3�� ��� ����) : %d\n",hap);

	}

}
