package part01.sec01.exam01;

public class Ex03_07 {

	public static void main(String[] args) {
		int a;    
		double b;            //실수 8byte
		
		a=(int)123.45f;     //f:4byte  8byte에서 4byte로 처리
		b=200;   //bad!!!    //정수 4byte
		
		System.out.printf("a의 값==>%d\n", a);
		System.out.printf("b의 값==>%f\n", b);
	

	}

}
