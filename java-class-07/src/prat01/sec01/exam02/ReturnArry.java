package prat01.sec01.exam02;

public class ReturnArry {

	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray(); // 호출
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

	public static int[] makeArray() {       //정수타임 배열을 리턴 시킬 경우 []를 붙혀서 배열 타입이라고 선언 해준다.
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
			                     //앞에서 배열을 이미 선언 했기때문에 또한번 []를 안쳐도  배열로 인식 한다.
		}
		return temp;      //리턴은 끝내다 또는 돌려주다
	}

}
