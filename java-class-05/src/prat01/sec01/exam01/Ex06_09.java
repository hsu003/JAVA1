package prat01.sec01.exam01;

public class Ex06_09 {

	public static void main(String[] args) {
		int i;
		int hap=0;
		
		  //for���� �� ó���� ���      //���� ���Ϸ��� ���� ������ �־�� �Ѵ�.
		
		for(i=501;i<=1000;i+=2) {
			hap=hap+i;   //hap+=i;
			
		}
		System.out.printf("500���� 1000������ Ȧ���� �� : %d\n",hap);
	}

}
