package part01.sec01.exam02;

public class CircleArea {

	public static void main(String[] args) {
		final double PI = 3.14;  //�������� ����� ����
		double radius = 10;     //���� ������
		double circleArea = 0; //���� ����
		
		circleArea = radius*radius*PI;   //���� ���� ���
		
		//���� ������ȭ�鿡 ����Ѵ�
		//        1
		//        2
		
		System.out.print("���� ���� = ");
		System.out.printf("%5.1f", circleArea); //%���÷��� ���� �� �� ���� �ڿ��� �Ҽ��� �ڸ�
		System.out.printf("���� ����==>%f\n",circleArea);
		

	}

}
