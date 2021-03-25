package prat01.sec01.exam02;

public class ForEachEx {
	enum Week {
		월, 화, 수, 목, 금, 토, 일 // enum 무언가 나열하는 타입을 말한다.
	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		String numes[] = { "사과 ", "배 ", "바나나 ", "체리 ", "딸기 ", "포도 " };
		int sum = 0;

		for (int k : num)
			sum += k;
		System.out.println("합은" + sum);

		for (String s : numes)
			System.out.print(s + "");

		System.out.println();
		for (Week day : Week.values())
			System.out.print(day + "요일 ");

		System.out.println();

	}

}
