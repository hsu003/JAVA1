class A04{
	//멤버필드
	@SuppressWarnings("unused")
	private int a;
	private static int b;
	//생성자
	public A04() {
		a = 10;
		b = 20;
	}
	@SuppressWarnings("unused")
	public void disp2() {
		int c = 10;	//지역변수
	}
	@SuppressWarnings("unused")
	public void disp3() {
		int c = 100;
	}
	//멤버메소드
	public void disp() {
		class Inner04{		//지역중첩클래스
			private int c;
			public Inner04() {
				c = 30;
			}
			public void disp_in() {
				//System.out.println("a = " + a);
				System.out.println("b = " + b);
				System.out.println("c = " + c);
			}
		}
		Inner04 in = new Inner04();
		in.disp_in();
	}
	public void disp4() {
		@SuppressWarnings("unused")
		class Inner04{		//지역중첩클래스
			private int c;
			public Inner04() {
				c = 30;
			}
			public void disp_in() {
				//System.out.println("a = " + a);
				System.out.println("b = " + b);
				System.out.println("c = " + c);
			}
		}
	}
}
public class Exam_04 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		A04 ap = new A04();
		
	}
}

















