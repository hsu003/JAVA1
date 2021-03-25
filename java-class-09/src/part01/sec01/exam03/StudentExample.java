package part01.sec01.exam03;
                            
class Student{
	
}

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();   ///new 라는 객체가 생성 되면 각각 만든다.
		System.out.println("s1 변수가 Student 객체를 참조 합니다.");
		System.out.println(s1);
		
		Student s2 = new Student();
		System.out.println("s2 변수가 Student 객체를 참조 합니다.");
		System.out.println(s2);

	}

}
