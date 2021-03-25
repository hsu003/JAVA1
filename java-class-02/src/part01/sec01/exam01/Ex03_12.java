package part01.sec01.exam01;

public class Ex03_12 {

	public static void main(String[] args) {
		char a,b,c,d,e;
		
		a='A';   //a= 65
		
		System.out.printf("%c\t",a);   //%출력한다 c문자로 출력한다  \t 탭
		System.out.printf("%d \n",(int)a);  //% 출력한다 d정수(숫자)로 출력한다  \n 다음줄  (int)10진수
		
		
		b='a';    
		c=(char)(b+1);  //
		
		System.out.printf("%c\t", b);
		System.out.printf("%c\n", c);
		
		d=90;
		System.out.printf("%c\n", d);
		
		d='가';
		e=(char)(d+1);
		System.out.printf("%d \t", (int)d);  //%출력한다 d정수(숫자)로 
		System.out.printf("%c\n", e);
		System.out.printf("%d\n",(int)'각');
		

	}

}
