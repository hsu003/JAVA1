package part01.sex01.exam02;

import java.io.IOException;
import java.util.Scanner;

public class AsciCode {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);

		// System.in.read(); ���� �ϳ��� �Է� ���� (�ƽ�Ű�ڵ�or�����ڵ�)

		System.out.print("ù��° �ƽ�Ű �ڵ�  : ");
		char a1 = (char) System.in.read(); // ���� ��ȯ�� ���ؼ� �������� �Ȱ��� ������ ��Ų��.
		System.in.read(); // System.in.skip(2); ����Ű�� 2byte �̹Ƿ� ��ŵ 2�� ��� �����ϴ�
		System.in.read(); // �ش� �ϴ� ����� ����Ű�� ����
		System.out.print("�ι�° �ƽ�Ű �ڵ� : ");
		char b1 = (char) System.in.read();
		//
		if (a1 > b1) {
			System.out.println("������ ���� �Ѱ��� �Է��� �ּ���.");
		} else {
			if (a1 < b1) {
				System.out.println("������ ���� �Ѱ��� �Է��� �ּ���.");
			}

			else { // ���� if �ΰ��� �ƴҰ�� �ƹ� ���ĵ� �Ƚᵵ �ȴ�.
				System.out.printf("�Է��Ͻ� �� ���ڴ� ���� ���� �Դϴ�.\n");
				System.out.printf("�Է��Ͻ� �� ���ڴ� a1:%c b1:%c �Դϴ�.\n", a1, b1);
				System.out.printf("�Է��Ͻ� �� ������ �ƽ�Ű �ڵ尪��  a1:%d b1:%d �Դϴ�.\n", (int) a1, (int) b1);
				// ������ ���� ǥ�� �ҷ��� �о�帰 ������ ��ȯ ���Ѿ� �Ѵ�.
			}

		}

		/*
		 * System.out.print("ù��° �ƽ�Ű �ڵ� : "); char a = (char) System.in.read();
		 * 
		 * System.in.read();
		 * 
		 * System.out.print("�ι�° �ƽ�Ű �ڵ� : "); char b = (char)System.in.read();
		 * 
		 * System.in.read(); char c; if((char)c=a>b)
		 * System.out.printf("ù��° �Է��Ͻ� ������ �ƽ�Ű�ڵ� ���� �� Ů�ϴ�."+"%d > %d = %d\n",a1,b1,c);
		 * 
		 * else if((char)c=a<b)
		 * System.out.printf("�ι�° �Է��Ͻ� ������ �ƽ�Ű�ڵ� ���� �� Ů�ϴ�."+"%d < %d = %d\n",a1,b1,c);
		 * 
		 * else if((char)c= a== b)
		 * System.out.printf("�Է��Ͻ� �� ���ڴ� ���� ���� �Դϴ�."+"%d = %d = %d\n",a1,b1,c);
		 * 
		 */

		s.close();
	}

}
