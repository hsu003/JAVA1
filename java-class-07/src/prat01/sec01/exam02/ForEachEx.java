package prat01.sec01.exam02;

public class ForEachEx {
	enum Week {
		��, ȭ, ��, ��, ��, ��, �� // enum ���� �����ϴ� Ÿ���� ���Ѵ�.
	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		String numes[] = { "��� ", "�� ", "�ٳ��� ", "ü�� ", "���� ", "���� " };
		int sum = 0;

		for (int k : num)
			sum += k;
		System.out.println("����" + sum);

		for (String s : numes)
			System.out.print(s + "");

		System.out.println();
		for (Week day : Week.values())
			System.out.print(day + "���� ");

		System.out.println();

	}

}
