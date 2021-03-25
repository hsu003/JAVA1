class A03{
	//멤버필드
	private int a;
	private static int b;
	//생성자
	public A03() {
		a = 10;
		b = 20;
	}
	//멤버메소드
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	//중첩클래스
	static class Inner03{
		private int c;
		public Inner03() {
			c = 30;
		}
		public void disp_in() {
			//System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
		}
		class Inner_in{
			//클래스 멤버들.....
		}
	}
}
public class Exam_03 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		A03 ap = new A03();
		A03.Inner03 ai = new A03.Inner03();
		
	}
}











