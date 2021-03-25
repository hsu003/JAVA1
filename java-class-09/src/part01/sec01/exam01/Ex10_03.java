package part01.sec01.exam01;

class Car3 {
	private String color;       //private 가 붙으면 다른 클래스에서 접근 할수가 없다.(private==>캡슐화)
	private int speed;          //privat 가 붙으면  set 이라는 간접적으로 접근을 해야 접근할수 있다.

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
		this.color = color;    //지역변수가 매개변수를 읽을려면 디스(this)라는 프로그램을 사용한다.
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}
}

public class Ex10_03 {

	public static void main(String[] args) {
		Car3 myCar1=new Car3();
		
		myCar1.setColor("빨강");
		myCar1.setSpeed(0);
		myCar1.upSpeed(30);
		
		System.out.println("자동차1의 색상은 : "+myCar1.gerColor()+"이며, 현재속도는 : "+myCar1.gerSpeed()+"km 입니다.");
		//System.out.println("자동차1의 색상은 : "+myCar1.color+"이며, 현재속도는 : "+myCar1.speed+"km 입니다.");

	}

}
