package baseball;
import java.io.*;

public class BaseMain {
	public static void main(String[] args) throws IOException {
		BasePro pro = new BaseballPro();
		while(true) {
			System.out.print("1.등록  2.이동  3.수정  4.삭제  5.보기  6.종료 : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 : pro.insert(); break;
			case 2 : pro.trade(); break;
			case 3 : pro.edit(); break;
			case 4 : pro.delete(); break;
			case 5 : pro.view(); break;
			case 6 : pro.exit(); break;
			default: System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
	}
}
