package part01.sec01.exam01;

public class Ex03_13 {

	public static void main(String[] args) {
		int a,b;
		char c,d;
		
		a=0xF90A;     
		b=0x50;
		
		System.out.printf("%d \n",a);
		System.out.printf("%c \n",a);
		System.out.printf("%d \n",b);
		
		c=(char)b;
		System.out.printf("%c \n",c);
		System.out.println(c);
		
		
		d='#';
		System.out.printf("%c�� ASCII���� %d �Դϴ�\n",d,(int)d);  //(int) ��� ��� �Ҷ��� ���ڷ� ǥ��
		System.out.println(d);   
		// printf  ���� �����ϴ� ���� ǥ��
		//println  ����Ǿ� �ִ� ���� ǥ�� 
		
		

	}

}
