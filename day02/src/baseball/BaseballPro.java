package baseball;
import java.util.*;

public class BaseballPro implements BasePro {
	Hashtable<String, Hashtable<String, Player>> team;
	Scanner in;
	
	public BaseballPro() {
		team = new Hashtable<>();
		in = new Scanner(System.in);
		String teamName[] = new String[]{"LG", "삼성", "두산", "키움", "NC"};
		for (int i=0; i<teamName.length; ++i) {
			team.put(teamName[i], new Hashtable<String, Player>());
		}
	}
	
	@Override
	public void insert() {
		System.out.print("팀의 이름을 입력 : ");
		String teamName = in.next();
		if (team.containsKey(teamName)) {
			System.out.print("선수명을 입력 : ");
			String name = in.next();
			System.out.print("연봉을 입력 : ");
			int salary = in.nextInt();
			System.out.print("포지션을 입력 : ");
			String position = in.next();
			Player insert = new Player(teamName, name, salary, position);
			Hashtable<String, Player> ht = team.get(teamName);
			ht.put(name, insert);
		}else {
			System.out.println("팀이름을 잘못입력하셨습니다. 다시입력해 주세요!!");
			insert();
		}
	}

	@Override
	public void trade() {
		System.out.print("팀명을 입력 : ");
		String teamName = in.next();
		if (team.containsKey(teamName)) {
			Hashtable<String, Player> ht = team.get(teamName);
			System.out.print("선수명을 입력 : ");
			String name = in.next();
			if (ht.containsKey(name)) {
				System.out.print("이동할 팀명을 입력 : ");
				String tradeTeamName = in.next();
				if (team.containsKey(tradeTeamName)) {
					Player trade = ht.get(name);
					ht.remove(name);
					ht = team.get(tradeTeamName);
					ht.put(name, trade);
				}else {
					System.out.println("이동할 팀명을 잘못 입력하셨습니다.");
				}
			}else {
				System.out.println("선수명을 잘못 입력하셨습니다.");
			}
		}else {
			System.out.println("팀명을 잘못 입력하셨습니다. 다시 입력해 주세요!!");
			trade();
		}
	}

	@Override
	public void edit() {
		System.out.print("팀명을 입력 : ");
		String teamName = in.next();
		if (team.containsKey(teamName)) {
			Hashtable<String, Player> ht = team.get(teamName);
			System.out.print("선수명을 입력 : ");
			String name = in.next();
			if (ht.containsKey(name)) {
				Player edit = ht.get(name);
				System.out.println("현재 연봉은 " 
								+ edit.getSalary()+"원 입니다.");
				System.out.print("수정하실 연봉은 : ");
				edit.setSalary(in.nextInt());
				System.out.println("현재 포지션은 " 
						+ edit.getPosition() +"입니다.");
				System.out.print("수정하실 포지션은 : ");
				edit.setPosition(in.next());
				System.out.println(edit.getName()+
						"님의 연봉과 포지션을 수정하였습니다.");
			}else {
				System.out.println("선수명을 잘못 입력하셨습니다.");
			}
		}else {
			System.out.println("팀명을 잘못 입력하셨습니다. 다시 입력해 주세요!!");
			edit();
		}

	}

	@Override
	public void delete() {
		System.out.print("팀명을 입력 : ");
		String teamName = in.next();
		if (team.containsKey(teamName)) {
			Hashtable<String, Player> ht = team.get(teamName);
			System.out.print("선수명을 입력 : ");
			String name = in.next();
			if (ht.containsKey(name)) {
				ht.remove(name);
				System.out.println(teamName+"팀의 " 
								+ name+"선수를 삭제하였습니다.");
			}else {
				System.out.println("선수명이 틀렸습니다. 다시 입력해 주세요!!");
			}
		}else {
			System.out.println("팀명을 잘못 입력하셨습니다. 다시 입력해 주세요!!");
			delete();
		}

	}

	@Override
	public void view() {
		System.out.print("팀명을 입력 : ");
		String teamName = in.next();
		if (team.containsKey(teamName)) {
			Hashtable<String, Player> ht = team.get(teamName);
			Enumeration<String> enu = ht.keys();
			while(enu.hasMoreElements()) {
				String key = enu.nextElement();
				Player view = ht.get(key);
				view.disp();
			}
		}else {
			System.out.println("팀명을 잘못 입력하셨습니다. 다시 입력해 주세요!!");
			view();
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.!!");
		System.exit(0);
	}

}














