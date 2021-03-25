package part01.sec01.exam03;

public class CarExample4 {

	public static void main(String[] args) {
		Car4 myCar=new Car4();
		
		myCar.setGas(5);
		
		boolean gasState=myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발 합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
		

	}

}
