package part01.sec01.exam03;

public class CarExample3 {

		public static void main(String[] args) {
			Car3 car1=new Car3();    //객체 생성시 생성자 (매서드의 한 종류) 호출 : Car()
			System.out.println("car1.company : "+car1.company);
			System.out.println();
			
			Car3 car2=new Car3("자가용");   //객체 생성시 객체는 초기화상태로 생성이 된다
			System.out.println("car2.company :"+car2.company);
			System.out.println("car2.model :"+car2.model);
			System.out.println();
			
			Car3 car3=new Car3("자가용","빨강");
			System.out.println("car3.company :"+car3.company);
			System.out.println("car3.model :"+car3.model);
			System.out.println("car3.color :"+car3.color);
			System.out.println();
			
			Car3 car4=new Car3("자가용","검정",200);
			System.out.println("car4.company :"+car4.company);
			System.out.println("car4.model :"+car4.model);
			System.out.println("car4.color :"+car4.color);
			System.out.println("car4.maxSpeed :"+car4.maxSpeed);
			System.out.println();
			
		}


	}