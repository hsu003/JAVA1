package part01.sec01.exam01;

	class Car8 {
		private String color;
		private int speed;

		Car8() {
		}

		Car8(String color) {
			this.color = color;
		}

		Car8(String color, int speed) {
			this.color = color;
			this.speed = speed;
		}

		public String getColor() {
			return color;
		}

		public int getSpeed() {
			return speed;
		}
	}

	public class Ex10_08 {
		public static void main(String[] args) {
			Car8 myCar1 = new Car8();
			Car8 myCar2 = new Car8("����");
			Car8 myCar3 = new Car8("�Ķ�", 30);

			System.out.println("�ڵ���1�� ������ " + myCar1.getColor() + "�̸�, ����ӵ��� " + myCar1.getSpeed() + "km �Դϴ�.");
			System.out.println("�ڵ���2�� ������ " + myCar2.getColor() + "�̸�, ����ӵ��� " + myCar2.getSpeed() + "km �Դϴ�.");
			System.out.println("�ڵ���3�� ������ " + myCar3.getColor() + "�̸�, ����ӵ��� " + myCar3.getSpeed() + "km �Դϴ�.");
		}
		
	}
	


