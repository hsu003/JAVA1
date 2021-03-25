package prat01.sec01.exam02;    //비정방형 배열을 만들어 값을 초기화하고 출력하시오.

public class IrregularArray {

	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];

		int i;

		for (i = 0; i < intArray.length; i++) { // 0,1,2,3

			for (int k = 0; k < intArray[i].length; k++) // 3,2,3,2
				// i=0-->k=0, 1,2, ===>10,11,12

				intArray[i][k] = (i + 1) * 10 + k;

		}

		for (i = 0; i < intArray.length; i++) { // 0,1,2,3

			for (int k = 0; k < intArray[i].length; k++)  // 3,2,3,2
				System.out.print(intArray[i][k] + " ");
				System.out.println();
			

		}

	}
}
