package part01.sec01.exam01;

import java.io.IOException;

public class Priblem02_04 {

	public static void main(String[] args)throws IOException {
		
		// Reyboard�� ���Ͽ� �Է�
		// System.in.read()==> �ƽ�Ű�ڵ�(�����ϳ�)
		
		System.out.print("�Է� : ");   //���� �ٲ��� �ʴ´�.
		// ����Ű�� ������ �ƽ�Ű�ڵ� 13��(carriage return)
		// �Էµǰ� ������ �� �� 10�� (new Line)�� �Էµȴ�.
		// System.in.read()-48 �Ǵ� '0'
		// int num,=Ststem.in.read()-'0';  num�� ���������ϴ� ����
		// (char)System.in.read();==> 2byte ���ڷ� ó��
		int num1=System.in.read();
		System.out.println("��� : "+num1);
		System.in.read();      //���ϰ��� �ϴ� �Է°�
		System.in.read();     //�ý��� �� ���尡 �ι��� ������ ���� ������ ���ڷ� ���ԵǾ ���͸� �б� ���ؼ�
		
		System.out.print("�Է� : ");
		int num2=System.in.read()-48;
		System.out.println("��� : "+num2);
		System.in.read();
		System.in.read();
		
		System.out.print("�Է� : ");
		char cha=(char)System.in.read();
		System.out.println("��� : "+cha);
				
		
	}

}
