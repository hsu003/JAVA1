package part01.sec01.exam01;

class Car2 {
	String color;
	int speed;

	void upSpeed(int value) {
		speed = speed + value;

	}

	void downSpeed(int value) {
		speed = speed - value;

	}
	
	String gerColor() {       //ger==> ��� ����Ǿ� �ִ� ���� ��������.   
		                     //set==> ��� ������ �ϴ�.

		 return color;  
	}
	
	int gerSpeed() {
		
		return speed;
		
	}
}

public class Ex10_02 {

	public static void main(String[] args) {
		
		Car2 myCar1= new Car2();
		myCar1.color="����";
		myCar1.speed=0;
		
		myCar1.upSpeed(30);
		
		System.out.println("�ڵ���1�� ������ : "+myCar1.color+"�̸�, ����ӵ��� : "+myCar1.speed+"km �Դϴ�.");
		System.out.println("�ڵ���1�� ������ : "+myCar1.gerColor()+"�̸�, ����ӵ��� : "+myCar1.gerSpeed()+"km �Դϴ�.");

	}

}
