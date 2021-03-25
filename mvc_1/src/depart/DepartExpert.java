package depart;

import java.util.*;

public class DepartExpert {
	public List<String> getAdvice(String depart){
		List<String> list = new ArrayList<>();
		if (depart.equals("kor")) {
			list.add("국문학을 공부하는 곳입니다.");
			list.add("국어를 잘 해야 합니다.");
		}else if (depart.equals("eng")) {
			list.add("영문학을 공부하는 곳입니다.");
			list.add("영어를 잘 해야 합니다.");
		}else if (depart.equals("com")) {
			list.add("컴퓨터학를 공부하는 곳입니다.");
			list.add("컴퓨터를 잘 해야 합니다.");
		}else if (depart.equals("game")) {
			list.add("게임학을 공부하는 곳입니다.");
			list.add("게임을 잘 해야 합니다.");
		}else {
			list.add("죄송합니다. 아직 준비가 되지 않았습니다.");
		}
		return list;
	}
}



