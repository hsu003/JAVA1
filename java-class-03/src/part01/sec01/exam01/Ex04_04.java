package part01.sec01.exam01;

public class Ex04_04 {

	public static void main(String[] args) {
		int a=10, b;
		
		b=a++;   //  10
		System.out.printf("%d\n",b);
		
		b=++a;   //������ �Ǵ� ���� �����ڴ� a�� ���� ��ó ���� ��Ų��  12
		System.out.printf("%d\n",b);
		
		b=a++ +3;
	    System.out.printf("%d\n",b);
		
		b=++a +3;
		System.out.printf("%d\n",b);
		
		
		  //a++; //a=a+1; System.out.printf("%d\n",a); ++a; //a=a+1;
		  //System.out.printf("%d\n",a); 
		  //b=++a; //���� �����ڴ� ������Ű�� ������ �Ѿ�� //���� �����ڴ� ������ �Ѿ�� �����ȴ�. 
		  //System.out.printf("a=%d b=%d\n",a,b);
		 

	}

}
