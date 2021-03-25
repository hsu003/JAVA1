package part01.sec01.exam01;

public class Ex09_16 {
	
	public static void func1() {
		System.out.printf("void 형 메서드는 돌려줄게 없음. \n");	
	}
	
	public static int func2() {
		return 100;
	}

	public static void main(String[] args) {
		int a;
		
		func1();
		a=func2();
		System.out.printf("int 형 메서드에서 돌려준 값 ==> %d\n",a);
		

	}

}
