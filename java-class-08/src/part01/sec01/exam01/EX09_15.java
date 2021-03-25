package part01.sec01.exam01;

public class EX09_15 {
	static int a=100;                       //static 라는 변수타입이 있어야 쓸수 있다.
	
	public static void func1() {
		int a =200;                          //지역변수 (안쪽 변수)
		System.out.printf("func1() 에서 a의 값 ==> %d \n",a);
	}

	public static void main(String[] args) {
		func1();                             //전역변수(바까쪽)
		System.out.printf("main() 에서 a의 값 ==> %d \n",a);
		

	}

}
