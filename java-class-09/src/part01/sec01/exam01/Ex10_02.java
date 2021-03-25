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
	
	String gerColor() {       //ger==> 어디 저장되어 있는 것을 가져오다.   
		                     //set==> 어디 저장을 하다.

		 return color;  
	}
	
	int gerSpeed() {
		
		return speed;
		
	}
}

public class Ex10_02 {

	public static void main(String[] args) {
		
		Car2 myCar1= new Car2();
		myCar1.color="빨강";
		myCar1.speed=0;
		
		myCar1.upSpeed(30);
		
		System.out.println("자동차1의 색상은 : "+myCar1.color+"이며, 현재속도는 : "+myCar1.speed+"km 입니다.");
		System.out.println("자동차1의 색상은 : "+myCar1.gerColor()+"이며, 현재속도는 : "+myCar1.gerSpeed()+"km 입니다.");

	}

}
