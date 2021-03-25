package sungjuk;

import java.io.IOException;

public class SungMain {
	public static void main(String[] args) throws IOException {
		SungPro pro = new SungjukPro();
		while(true) {
			System.out.print("1.등록  2.보기  3.수정  4.삭제  "
					+ "5.파일저장  6.파일열기  7.종료: ");
			//파일저장시 List에 있는 데이터를 파일에 저장하고,
			//파일열기시 List에 있는 기존 값은 지우고 
			//파일에 있는 데이터로 로딩해준다.
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 : pro.insert(); break;
			case 2 : pro.view(); break;
			case 3 : pro.edit(); break;
			case 4 : pro.delete(); break;
			case 5 : pro.save(); break;
			case 6 : pro.load(); break;
			case 7 : pro.exit(); break;
			default: System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
	}
}
