package part01.sex01.exam02;

public class TernaryOperator {

	public static void main(String[] args) {
		int a=3, b=5;
		
		System.out.println("두 수의 차는"+((a>b)?(a-b):(b-a)));  //()는 사용해도 무관하다
		System.out.println("두 수의 차는"+((a>b)?a-b:b-a));

	}

}
