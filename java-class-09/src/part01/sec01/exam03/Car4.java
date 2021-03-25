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
			System.out.println("gas가 없습니다.");
			return false; // 리턴문은 메서드 종료
		}

		System.out.println("gas가 없습니다.");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas 잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas 잔량 : " + gas + ")");
				return; // run()메서드 실행 강제종료
				//break;
			}
		
		}
	}
}
