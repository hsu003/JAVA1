class A02{
	//����ʵ�
	private int a;
	private int b;
	//������
	public A02() {
		a = 10;
		b = 20;
	}
	//����޼ҵ�
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	//��øŬ����
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
			//Ŭ���� �����.....
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








