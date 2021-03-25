class A02{
	//멤버필드
	private int a;
	private int b;
	//생성자
	public A02() {
		a = 10;
		b = 20;
	}
	//멤버메소드
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	//중첩클래스
	class Inner02{
		private int c;
		public Inner02() {
			c = 30;
		}
		public void disp_in() {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
		}
		class Inner_in{
			//클래스 멤버들.....
		}
	}
}
public class Exam_02 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		A02 ap = new A02();
		A02.Inner02 ai = ap.new Inner02();
	}
}








