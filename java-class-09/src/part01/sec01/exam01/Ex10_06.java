package part01.sec01.exam01;

class Car6 {
	private String color;
	private int speed;

	Car6() {
		color = "����";
		speed = 0;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}
}

public class Ex10_06 {
	public static void main(String[] args) {
		Car6 myCar1 = new Car6();
		Car6 myCar2 = new Car6();

		System.out.println("�ڵ���1�� ������ " + myCar1.getColor() + "�̸�, ����ӵ��� " + myCar1.getSpeed() + "km �Դϴ�.");
		System.out.println("�ڵ���2�� ������ " + myCar2.getColor() + "�̸�, ����ӵ��� " + myCar2.getSpeed() + "km �Դϴ�.");
	}
}

