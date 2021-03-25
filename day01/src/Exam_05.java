class A05{
	public void disp() {
		System.out.println("aaa");
	}
}
interface B05{
	public void disp();
}
public class Exam_05 {	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//A05 ap = new A05();
		A05 ap = new A05() {
			public void disp() {
				System.out.println("bbb");
			}
		};
		ap.disp();
		B05 bp = new B05() {
			public void disp() {
				System.out.println("익명중첩클래스");
			}
		};
		
	}
}













