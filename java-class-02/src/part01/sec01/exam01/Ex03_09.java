package part01.sec01.exam01;

public class Ex03_09 {

	public static void main(String[] args) {
		int a,b,c,d;
		
		a=100+100;   //a=200
		b=a+100;     //b=300
		c=a+b-100;  //c=400
		d=a+b+c;    //d=900
		
		System.out.printf("a,b,c,d�� ��==>%d,%d,%d,%d\n",a,b,c,d);
		a=b=c=d=100;   //���� ������ �쿡�� ��
		System.out.printf("a,b,c,d�� ��==>%d,%d,%d,%d\n",a,b,c,d);
		a=100;
		a=a+200;
		System.out.printf("a�� ��==>%d\n", a);
		
//		byte bb=127;  //-128~127
//		System.out.println("b="+bb);
//        bb=(byte) (bb+1); 
//		System.out.println("b="+bb);
		
		
//		byte cc=100;
//		System.out.println("c="+cc);
//		int ccc=(int)100L; //L++> Long(8byte) ���� ��ȯ
//		System.out.println("cc="+cc);
		

	}

}
