package part01.sec01.exam02;          //�޼ҵ� ȣ���� ������ �Ǵ� �⺻���� ����

import java.util.Scanner;

public class Exam_0503 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		int sum = hap(num);
		
		System.out.println("1~n ������ �� : "+sum);
		//System.out.printf("1 ~ %d ������ �� : %d",num,sum);

	}
	
	public static int hap(int n) {
		if(n==1)
			return 1;
		int tot=n+hap(n-1);     //��� ȣ�� : �ڱ� �ڽ��� ȣ�� �Ѵٰ� �ؼ� ��� ȣ�� 
		                       // ��� �޼ҵ尡 �ٸ� �޼ҵ带 ȣ�� ������ �����ִ� ���� ������ ������ ���� ȣ���� �ȴ�.
		return tot;
		
		/*
		 * int hap=0; 
		 * for(int i = 0; i <= n; i++) {
		 *  hap+=i; 
		 *  } return hap;
		 */
	}

}
