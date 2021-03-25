class Point2d{
		int x;
		int y;
		Point2d(){
			x= 100;
			y= 150;
		}
		public void disp() {
			System.out.println
			("좌표값 ["+x+","+y+"] 입니다.");
		}
}

class Point3d extends Point2d{

	int z;
	Point3d(){

		z= 300;
	}
	public void disp() {
		System.out.println
		("좌표값 ["+x+","+y+","+z+"] 입니다.");
	}
}
public class Exam_08 {

	public static void main(String[] args) {
		Point2d p2 =new Point3d();
		p2.disp();
	
		//다운 캐스팅의 조건
		//1. 부모객체는 업캐스팅 되어있는 객체이어야 한다.
		//2. 자식의 이림을 캐스팅으로 써줘야 한다.
		/*Point3d p3 = new Point3d();
		Point2d p2 = p3;   //업캐스팅   자식에 생성자로 부모의 객체를 만든다.
		System.out.println("p2.x =" + p2.x);
		System.out.println("p2.y =" + p2.y);
		System.out.println("p2.z =" + p2.z);
		System.out.println("p3.x =" + p3.x);
		System.out.println("p3.y =" + p3.y);
		System.out.println("p3.z =" + p3.z);*/
		
		
		//객체에서 연산은 대입연사만 가능
		//대입연산도 같은 클래스 형태 또는 상속관계에서 가능
		/*Point2d p1 =new Point2d();
		Point2d p2 = p1;
		p2.x=1000;
		p1.disp();
		p2.disp();*/

	}

}

