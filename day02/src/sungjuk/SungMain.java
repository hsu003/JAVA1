package sungjuk;

import java.io.IOException;

public class SungMain {
	public static void main(String[] args) throws IOException {
		SungPro pro = new SungjukPro();
		while(true) {
			System.out.print("1.���  2.����  3.����  4.����  "
					+ "5.��������  6.���Ͽ���  7.����: ");
			//��������� List�� �ִ� �����͸� ���Ͽ� �����ϰ�,
			//���Ͽ���� List�� �ִ� ���� ���� ����� 
			//���Ͽ� �ִ� �����ͷ� �ε����ش�.
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 : pro.insert(); break;
			case 2 : pro.view(); break;
			case 3 : pro.edit(); break;
			case 4 : pro.delete(); break;
			case 5 : pro.save(); break;
			case 6 : pro.load(); break;
			case 7 : pro.exit(); break;
			default: System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
	}
}
