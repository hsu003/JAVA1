package part01.sec01.exam03;

public class Car3 {

	String company = "현대자동차";  //생성자에서 값을 주면 계속 전달 된다.
	String model;
	String color;
	int maxSpeed;

	Car3() {
		
	}
	Car3(String model) {    //현재 존재하고 있는 객체
		//this.model = model;
		this(model,null);             //생성자 호출
	}

	Car3(String model, String color) {
		//this.model = model;
		//this.color = color;
		this(model,color,0);
	}

	Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}