package part01.sec01.exam01;

class MyChar{
	char x;
	char y;
}

public class Ex09_19 {
	
	static void func1(char x, char y) {
		char imsi;
		imsi = x;
		x=y;
		y=imsi;
		
		System.out.println("x="+x+","+"y="+y);
	}
	static void func2(MyChar ch) {
		char ismi;
		ismi = ch.x;
		ch.x = ch.y;
		ch.y= ismi;
		
		
		System.out.println("ch.x= "+ch.x+","+"ch.y= "+ch.y);
		
	}

	public static void main(String[] args) {
		char x='A',y='Z';
		System.out.printf("���� �� : x= %c, y= %c \n",x,y);
		func1(x,y);   //ȣ���ϸ鼭 ���� �ѱ�°��� �ݹ��� ����
		System.out.printf("���� ������ �� : x= %c, y= %c \n\n",x,y);
		
		MyChar ch=new MyChar();   //��ü ����
		ch.x='A';
		ch.y='Z';
		
		System.out.printf("���� �� : x= %c, y= %c \n",ch.x,ch.y);
		func2(ch);   //ȣ���ϸ鼭 �ּҸ� �ѱ�� ���� �ݹ��� ��庥��
		System.out.printf("�ּҸ� ������ �� : x= %c, y= %c",ch.x,ch.y);

		
	}

}
