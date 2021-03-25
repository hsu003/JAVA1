package baseball;
import java.io.*;

public class BaseMain {
	public static void main(String[] args) throws IOException {
		BasePro pro = new BaseballPro();
		while(true) {
			System.out.print("1.���  2.�̵�  3.����  4.����  5.����  6.���� : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 : pro.insert(); break;
			case 2 : pro.trade(); break;
			case 3 : pro.edit(); break;
			case 4 : pro.delete(); break;
			case 5 : pro.view(); break;
			case 6 : pro.exit(); break;
			default: System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
	}
}
