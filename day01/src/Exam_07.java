class A07{
	private int kor;
	
	public A07(int kor) {
		this.kor = kor;
	}
	
	//getter�޼ҵ�
	public int getKor() {
		return kor;
	}
	//setter�޼ҵ�
	public boolean setKor(int kor) {
		if (kor<0 || kor>100) return false;
		this.kor = kor;
		return true;
	}
}


public class Exam_07 {
	public static void main(String[] args) {
		A07 ap = new A07(50);
		//ap.kor = 1000;
		System.out.println("�������� : " + ap.getKor());
	}
}








