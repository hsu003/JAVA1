import test01.*;
class A06 extends Test01{
	public void disp() {
		System.out.println("a = " + a);
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		A06 t1 = new A06();
		//System.out.println("t1.a = " + t1.a);
		t1.disp();
	}
}
