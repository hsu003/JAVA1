package depart;

import java.util.*;

public class DepartExpert {
	public List<String> getAdvice(String depart){
		List<String> list = new ArrayList<>();
		if (depart.equals("kor")) {
			list.add("�������� �����ϴ� ���Դϴ�.");
			list.add("��� �� �ؾ� �մϴ�.");
		}else if (depart.equals("eng")) {
			list.add("�������� �����ϴ� ���Դϴ�.");
			list.add("��� �� �ؾ� �մϴ�.");
		}else if (depart.equals("com")) {
			list.add("��ǻ���и� �����ϴ� ���Դϴ�.");
			list.add("��ǻ�͸� �� �ؾ� �մϴ�.");
		}else if (depart.equals("game")) {
			list.add("�������� �����ϴ� ���Դϴ�.");
			list.add("������ �� �ؾ� �մϴ�.");
		}else {
			list.add("�˼��մϴ�. ���� �غ� ���� �ʾҽ��ϴ�.");
		}
		return list;
	}
}



