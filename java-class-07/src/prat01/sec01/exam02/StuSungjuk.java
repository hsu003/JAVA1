package prat01.sec01.exam02; //이름 배열 저장 되는 배열1개, 각각 점수가 저장되는 배열 1개씩 만들고 총점과 순위 나타내기

								//배열 6개 만들기   순위는 0,1,2

import java.util.Scanner;

public class StuSungjuk {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, i;
		

		System.out.print("학생의 수를 입력 :");
		a = s.nextInt();

		String name[] = new String[a];
		int kor[] = new int[a];
		int eng[] = new int[a];
		int mat[] = new int[a];
		int tot[] = new int[a];
		int rank[] = new int[a];

		for (i = 0; i < name.length; i++) {
			System.out.print(i + 1 + "번째 학생의 이름은 : ");
			name[i] = s.next();
			System.out.print(i + 1 + "번째 학생의 국어점수 : ");
			kor[i] = s.nextInt();
			System.out.print(i + 1 + "번째 학생의 영어점수 : ");
			eng[i] = s.nextInt();
			System.out.print(i + 1 + "번째 학생의 수어점수 : ");
			mat[i] = s.nextInt();
			tot[i] = kor[i] + eng[i] + mat[i];

		}
		for (i = 0; i < name.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < name.length; j++) {
				if (tot[i] < tot[j])
					rank[i]++;
			}
			System.out.println(name[i] + "님은 총점은" + tot[i] + "점이고, 순위는" + rank[i] + "등 입니다.");
		}

		/*
		 * for(i = 0 ; i < name.length ; i++) {
		 * System.out.println(name[i]+"님은 총점은"+tot[i]+"점이고, 순위는"+rank[i]+"등 입니다.");
		 * 
		 * }
		 */
		s.close();
	}

}
