package part01.sec01.exam03;

public class Car3 {

	String company = "�����ڵ���";  //�����ڿ��� ���� �ָ� ��� ���� �ȴ�.
	String model;
	String color;
	int maxSpeed;

	Car3() {
		
	}
	Car3(String model) {    //���� �����ϰ� �ִ� ��ü
		//this.model = model;
		this(model,null);             //������ ȣ��
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