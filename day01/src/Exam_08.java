class Point2d{
		int x;
		int y;
		Point2d(){
			x= 100;
			y= 150;
		}
		public void disp() {
			System.out.println
			("��ǥ�� ["+x+","+y+"] �Դϴ�.");
		}
}

class Point3d extends Point2d{

	int z;
	Point3d(){

		z= 300;
	}
	public void disp() {
		System.out.println
		("��ǥ�� ["+x+","+y+","+z+"] �Դϴ�.");
	}
}
public class Exam_08 {

	public static void main(String[] args) {
		Point2d p2 =new Point3d();
		p2.disp();
	
		//�ٿ� ĳ������ ����
		//1. �θ�ü�� ��ĳ���� �Ǿ��ִ� ��ü�̾�� �Ѵ�.
		//2. �ڽ��� �̸��� ĳ�������� ����� �Ѵ�.
		/*Point3d p3 = new Point3d();
		Point2d p2 = p3;   //��ĳ����   �ڽĿ� �����ڷ� �θ��� ��ü�� �����.
		System.out.println("p2.x =" + p2.x);
		System.out.println("p2.y =" + p2.y);
		System.out.println("p2.z =" + p2.z);
		System.out.println("p3.x =" + p3.x);
		System.out.println("p3.y =" + p3.y);
		System.out.println("p3.z =" + p3.z);*/
		
		
		//��ü���� ������ ���Կ��縸 ����
		//���Կ��굵 ���� Ŭ���� ���� �Ǵ� ��Ӱ��迡�� ����
		/*Point2d p1 =new Point2d();
		Point2d p2 = p1;
		p2.x=1000;
		p1.disp();
		p2.disp();*/

	}

}

