package part01.sec01.exam01;

public class Ex03_12 {

	public static void main(String[] args) {
		char a,b,c,d,e;
		
		a='A';   //a= 65
		
		System.out.printf("%c\t",a);   //%����Ѵ� c���ڷ� ����Ѵ�  \t ��
		System.out.printf("%d \n",(int)a);  //% ����Ѵ� d����(����)�� ����Ѵ�  \n ������  (int)10����
		
		
		b='a';    
		c=(char)(b+1);  //
		
		System.out.printf("%c\t", b);
		System.out.printf("%c\n", c);
		
		d=90;
		System.out.printf("%c\n", d);
		
		d='��';
		e=(char)(d+1);
		System.out.printf("%d \t", (int)d);  //%����Ѵ� d����(����)�� 
		System.out.printf("%c\n", e);
		System.out.printf("%d\n",(int)'��');
		

	}

}
