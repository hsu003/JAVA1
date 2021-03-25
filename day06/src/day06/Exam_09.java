package day06;

public class Exam_09 {
	static int boomb[][] = new int[9][9];
	
	public static void boomCount(int x, int y) {
		int minI = x-1; if (minI<0) minI = 0;
		int maxI = x+1; if (maxI>8) maxI = 8;
		int minJ = y-1; if (minJ<0) minJ = 0;
		int maxJ = y+1; if (maxJ>8) maxJ = 8;
		for(int i=minI; i<=maxI; ++i) {
			for(int j=minJ; j<=maxJ; ++j) {
				if (boomb[i][j] == 10) continue;
				boomb[i][j]++;
			}
		}
	}
	public static void main(String[] args) {
		for(int i=0; i<10; ++i) {
			int x = (int)(Math.random()*9);
			int y = (int)(Math.random()*9);
			
			if (boomb[x][y] != 0) {
				i--;
				continue;
			}
			
			boomb[x][y] = 10;
			boomCount(x, y);
		}
		
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				if (boomb[i][j]==10) System.out.print("ÆøÅº\t");
				else System.out.print(boomb[i][j] +"\t");
			}
			System.out.println();
		}
	}
}









