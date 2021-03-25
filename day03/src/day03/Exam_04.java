package day03;

import java.util.*;

public class Exam_04 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�⵵�� �Է� : ");
		int year = in.nextInt();
		System.out.print("���� �Է� : ");
		int month = in.nextInt();

		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);

		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for (int i = 1; i < week; ++i) {
			System.out.print("\t");
		}
		for (int i = 1; i <= lastDay; ++i) {
			System.out.print(i + "\t");
			week++;
			if (week > 7) {
				System.out.println();
				week = 1;
			}
		}

	}
}
