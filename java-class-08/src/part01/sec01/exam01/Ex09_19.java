package part01.sec01.exam01;

class MyChar{
	char x;
	char y;
}

public class Ex09_19 {
	
	static void func1(char x, char y) {
		char imsi;
		imsi = x;
		x=y;
		y=imsi;
		
		System.out.println("x="+x+","+"y="+y);
	}
	static void func2(MyChar ch) {
		char ismi;
		ismi = ch.x;
		ch.x = ch.y;
		ch.y= ismi;
		
		
		System.out.println("ch.x= "+ch.x+","+"ch.y= "+ch.y);
		
	}

	public static void main(String[] args) {
		char x='A',y='Z';
		System.out.printf("원래 값 : x= %c, y= %c \n",x,y);
		func1(x,y);   //호출하면서 값을 넘기는것은 콜바이 벨류
		System.out.printf("값을 전달한 후 : x= %c, y= %c \n\n",x,y);
		
		MyChar ch=new MyChar();   //객체 생성
		ch.x='A';
		ch.y='Z';
		
		System.out.printf("원래 값 : x= %c, y= %c \n",ch.x,ch.y);
		func2(ch);   //호출하면서 주소를 넘기는 것은 콜바이 어드벤스
		System.out.printf("주소를 전달한 후 : x= %c, y= %c",ch.x,ch.y);

		
	}

}
