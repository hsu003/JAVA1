class A03{
	//����ʵ�
	private int a;
	private static int b;
	//������
	public A03() {
		a = 10;
		b = 20;
	}
	//����޼ҵ�
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	//��øŬ����
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
			//Ŭ���� �����.....
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











