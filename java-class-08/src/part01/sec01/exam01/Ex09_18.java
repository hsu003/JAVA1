package part01.sec01.exam01;
                                                          //Ŭ������ ���� ���� ���赵 �̴�.
class MyInt{                                              //������ ��� �ִ� Ŭ������ ������ public ������ �ȵȴ�.
	     int a;   //Ŭ���� ���� ���� ������ field ������ �Ѵ�.         //Ŭ���� ���鶧 ���� ��ŸƮ�� �Ѱ��� ������ �ȴ�.
}

public class Ex09_18 {
	
	public static void func1(MyInt m) {
		m.a=m.a+1;
		
				
		System.out.printf("���� ���� a==> %d\n",m.a);
		
		
	}

	public static void main(String[] args) {
		//int a;       //local ����
		MyInt m = new MyInt();    //���� ����(���� ���� �ϴ� ����� �ȴ�.),����� �غ�
		m.a=10;                  //��.(dot)�� ��� ���� �Ҽ� �ִ� ���ٿ�����
		
		
		func1(m);
		System.out.printf("func1() ���� ���� a==> %d \n",m.a);

	}

}
