package part01.sec01.exam03;

public class Car2 {

	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	Car2() {
		// �⺻ ������, �ڵ����� ����� �ش�. �׷��� �����ڰ� ������ ������ �ʴ´�.
		// �⺻ �����ڴ� �츮 ���� ������ �ʴ´�.
		// ��ȯŸ���� ����. �ޱ⸸ �ϰ� ���� �ִ� ����� ����.
		// �����ڴ� Ŭ���� �̸��� ���� �̸��� ��� �Ѵ�.
	}

	// �ļ��� �������� �ִ°��� �����ε� �̶�� �Ѵ�.
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
