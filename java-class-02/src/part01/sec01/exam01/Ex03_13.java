package part01.sec01.exam01;

public class Ex03_13 {

	public static void main(String[] args) {
		int a,b;
		char c,d;
		
		a=0xF90A;     
		b=0x50;
		
		System.out.printf("%d \n",a);
		System.out.printf("%c \n",a);
		System.out.printf("%d \n",b);
		
		c=(char)b;
		System.out.printf("%c \n",c);
		System.out.println(c);
		
		
		d='#';
		System.out.printf("%c의 ASCII값은 %d 입니다\n",d,(int)d);  //(int) 경우 계산 할때만 문자로 표기
		System.out.println(d);   
		// printf  내가 지정하는 값을 표시
		//println  저장되어 있는 값을 표시 
		
		

	}

}
