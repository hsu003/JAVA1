package prat01.sec01.exam02;

public class ArrayExample2 {      //���� �޼ҵ� ���� �ٸ� �޼ҵ带 ����� �ִ�.

	public static void main(String[] args) {    //���� ȣ���� jvm�� ȣ���ؼ� ���� ��Ų��.
		int[] scores;                           //void : ������ ���� ����.
		scores =new int[] {83,90,87};
		int i;
		int sum1=0;
				
		
		
		for(i=0;i<3;i++)                                 //���� �߾˾Ƶα�
			sum1=sum1+scores[i];
	    
		System.out.println("���� :"+sum1);
		
		int sum2=add(new int[] {83,90,87});    //ȣ��� �ݵ�� ()�ʿ��ϴ�
		System.out.println("���� :"+sum2);
		System.out.println();
		

	}
  public static int add(int[] scores) {    //�޼ҵ�� ȣ��Ǿ� ���� �����Ѵ�.   add�� �迭�� �޾ƾ����� ���� ���� ��Ų��.()==>�Ű�����
	  int sum=0;
	  int i;
	  
	  
	  for(i = 0; i < 3; i++) {
		  sum=sum+scores[i];
	  }
	  return sum;    //sum���� �����ش�.    sum���� add�޼��带 ȣ���� ������ �����ش�.
  }
 
  }
	
	

