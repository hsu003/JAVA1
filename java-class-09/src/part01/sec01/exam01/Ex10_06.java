package part01.sec01.exam01;

class Car6 {
	private String color;
	private int speed;

	Car6() {
		color = "빨강";
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

		System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed() + "km 입니다.");
		System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재속도는 " + myCar2.getSpeed() + "km 입니다.");
	}
}

