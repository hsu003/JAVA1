package part01.sec01.exam03;

public class Car4 {
	int gas;

	Car4() {

	}

	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false; // ���Ϲ��� �޼��� ����
		}

		System.out.println("gas�� �����ϴ�.");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�.(gas �ܷ� : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�.(gas �ܷ� : " + gas + ")");
				return; // run()�޼��� ���� ��������
				//break;
			}
		
		}
	}
}
