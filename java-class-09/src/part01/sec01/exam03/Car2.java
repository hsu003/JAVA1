package part01.sec01.exam03;

public class Car2 {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car2() {
		// 기본 생성자, 자동으로 만들어 준다. 그러나 생성자가 있으면 만들지 않는다.
		// 기본 생성자는 우리 눈에 보이지 않는다.
		// 반환타임이 없다. 받기만 하고 돌려 주는 방법이 없다.
		// 생성자는 클래스 이름과 같은 이름을 써야 한다.
	}

	// 셍성자 여러개가 있는것을 오버로딩 이라고 한다.
	Car2(String model) {
		this.model = model;
	}

	Car2(String model, String color) {
		this.model = model;
		this.color = color;
	}

	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
