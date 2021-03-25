package part01.sec01.exam01;       //메소드의 기본 개념!!

public class Ex09_13 {

	public static int plus(int a, int b) {

		int result;
		result = a + b;
		return a+b;
	}

	public static void main(String[] args) {
		int hap;
		hap = plus(100, 200);
		System.out.printf("100과 200의 plus() 메서드 결과는 %d\n", hap);

	}

}
