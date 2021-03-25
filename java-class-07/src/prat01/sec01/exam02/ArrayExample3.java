package prat01.sec01.exam02;

public class ArrayExample3 {

	public static void main(String[] args) {
		int[] arr1=new int[3];
		
		for(int i=0;i<3;i++) {
			System.out.println("arr1["+i+"]"+arr1[i]);
		}
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		
		for(int i=0;i<3;i++) {
			System.out.println("arr1["+i+"]"+arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i=0;i<3;i++) {
			System.out.println("arr2["+i+"]"+arr2
					[i]);
		}
		
		arr2[0]=0.1;
		arr2[1]=0.2;
		arr2[2]=0.3;
		
		for(int i = 0;i < 3; i++) {
			System.out.println("arr2["+i+"]"+arr2[i]);
		}
		
		String[] arr3 = new String[3];     //String 타입은 값을 주지 않으면 nu11 이라는 크기가 없는 데이터가 생긴다.
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3["+i+"]"+arr3[i]);
			
			
		}
		arr3[0]="1월";
		arr3[1]="2월";
		arr3[2]="3월";
		
		for(int i = 0;i < 3; i++) {
			System.out.println("arr3["+i+"]"+arr3[i]);
		}
	}

}
