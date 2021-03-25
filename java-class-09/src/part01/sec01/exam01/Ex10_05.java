package part01.sec01.exam01;

class Car5{
	private int speed=0;
	
	public void upSpeed(int value) {     //public : 어디서든 접근 가능,default:팩키지 내에서 사용가능
		if(speed+value>200)
			speed=200;
		else 
			speed=speed+value;
		System.out.println("현재속도 ==> "+getSpeed());
		
	}
	
	public void downSpeed(int value) {
		if(speed-value<0)
			speed=0;
		else 
			speed=speed-value;
		System.out.println("현재속도==> "+getSpeed());
	}
	public int getSpeed() {
		return speed;
	}
}

public class Ex10_05 {

	public static void main(String[] args) {
		
		Car5 myCar1=new Car5();
		
		myCar1.upSpeed(100);
		myCar1.upSpeed(150);
		
		myCar1.downSpeed(50);
		myCar1.downSpeed(160);
		

	}

}
