class A04{
	//����ʵ�
	@SuppressWarnings("unused")
	private int a;
	private static int b;
	//������
	public A04() {
		a = 10;
		b = 20;
	}
	@SuppressWarnings("unused")
	public void disp2() {
		int c = 10;	//��������
	}
	@SuppressWarnings("unused")
	public void disp3() {
		int c = 100;
	}
	//����޼ҵ�
	public void disp() {
		class Inner04{		//������øŬ����
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
		class Inner04{		//������øŬ����
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

















