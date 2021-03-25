package day03;

public class Exam_01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a= 10;
		Integer b =new Integer("10");
		Integer c= Integer.valueOf(a); //박싱: 기본형자료형을 클래스타입으로 변환
		Integer d = a;  //오토박싱
		int e = b.intValue();   //언박싱: 클래스 자료형이 기본형 자료형으로 변환
		int f =c;  //오토언박싱
		System.out.println("c= "+c);
		
		
	}
}
