package part01.sec01.exam01;

public class Ex03_07 {

	public static void main(String[] args) {
		int a;    
		double b;            //�Ǽ� 8byte
		
		a=(int)123.45f;     //f:4byte  8byte���� 4byte�� ó��
		b=200;   //bad!!!    //���� 4byte
		
		System.out.printf("a�� ��==>%d\n", a);
		System.out.printf("b�� ��==>%f\n", b);
	

	}

}
