package part01.sec01.exam02;

public class TypeConversion {

	public static void main(String[] args) {
		byte b=127;
		int i=100;
		System.out.println(b+i);  //정수 + 정수는 = 정수
		System.out.println(10/4);  //정수 / 정수 = 정수
		System.out.println(10.0/4);  //실수 / 정수 = 큰쪽을 따라간다
		System.out.println((char)0x12340041);  //0x=16 진수  문자로 바꾸면 값이 변한다.
		System.out.println((byte)(b+i));
		System.out.println((int)2.9+1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println(((int)2.9)+((int)1.8));
		
		
		//char a ='a';
		

	}

}
