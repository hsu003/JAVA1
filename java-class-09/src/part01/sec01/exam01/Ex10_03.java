package part01.sec01.exam01;

class Car3 {
	private String color;       //private �� ������ �ٸ� Ŭ�������� ���� �Ҽ��� ����.(private==>ĸ��ȭ)
	private int speed;          //privat �� ������  set �̶�� ���������� ������ �ؾ� �����Ҽ� �ִ�.

	void upSpeed(int value) {
		speed = speed + value;

	}

	void downSpeed(int value) {
		speed = speed - value;

	}

	String gerColor() {

		return color;
	}

	int gerSpeed() {

		return speed;
	}

	void setColor(String color) {
		this.color = color;    //���������� �Ű������� �������� ��(this)��� ���α׷��� ����Ѵ�.
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}
}

public class Ex10_03 {

	public static void main(String[] args) {
		Car3 myCar1=new Car3();
		
		myCar1.setColor("����");
		myCar1.setSpeed(0);
		myCar1.upSpeed(30);
		
		System.out.println("�ڵ���1�� ������ : "+myCar1.gerColor()+"�̸�, ����ӵ��� : "+myCar1.gerSpeed()+"km �Դϴ�.");
		//System.out.println("�ڵ���1�� ������ : "+myCar1.color+"�̸�, ����ӵ��� : "+myCar1.speed+"km �Դϴ�.");

	}

}
