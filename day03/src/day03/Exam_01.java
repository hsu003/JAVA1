package day03;

public class Exam_01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a= 10;
		Integer b =new Integer("10");
		Integer c= Integer.valueOf(a); //�ڽ�: �⺻���ڷ����� Ŭ����Ÿ������ ��ȯ
		Integer d = a;  //����ڽ�
		int e = b.intValue();   //��ڽ�: Ŭ���� �ڷ����� �⺻�� �ڷ������� ��ȯ
		int f =c;  //�����ڽ�
		System.out.println("c= "+c);
		
		
	}
}
