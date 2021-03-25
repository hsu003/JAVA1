package baseball;
import java.util.*;

public class BaseballPro implements BasePro {
	Hashtable<String, Hashtable<String, Player>> team;
	Scanner in;
	
	public BaseballPro() {
		team = new Hashtable<>();
		in = new Scanner(System.in);
		String teamName[] = new String[]{"LG", "�Ｚ", "�λ�", "Ű��", "NC"};
		for (int i=0; i<teamName.length; ++i) {
			team.put(teamName[i], new Hashtable<String, Player>());
		}
	}
	
	@Override
	public void insert() {
		System.out.print("���� �̸��� �Է� : ");
		String teamName = in.next();
		if (team.containsKey(teamName)) {
			System.out.print("�������� �Է� : ");
			String name = in.next();
			System.out.print("������ �Է� : ");
			int salary = in.nextInt();
			System.out.print("�������� �Է� : ");
			String position = in.next();
			Player insert = new Player(teamName, name, salary, position);
			Hashtable<String, Player> ht = team.get(teamName);
			ht.put(name, insert);
		}else {
			System.out.println("���̸��� �߸��Է��ϼ̽��ϴ�. �ٽ��Է��� �ּ���!!");
			insert();
		}
	}

	@Override
	public void trade() {
		System.out.print("������ �Է� : ");
		String teamName = in.next();
		if (team.containsKey(teamName)) {
			Hashtable<String, Player> ht = team.get(teamName);
			System.out.print("�������� �Է� : ");
			String name = in.next();
			if (ht.containsKey(name)) {
				System.out.print("�̵��� ������ �Է� : ");
				String tradeTeamName = in.next();
				if (team.containsKey(tradeTeamName)) {
					Player trade = ht.get(name);
					ht.remove(name);
					ht = team.get(tradeTeamName);
					ht.put(name, trade);
				}else {
					System.out.println("�̵��� ������ �߸� �Է��ϼ̽��ϴ�.");
				}
			}else {
				System.out.println("�������� �߸� �Է��ϼ̽��ϴ�.");
			}
		}else {
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			trade();
		}
	}

	@Override
	public void edit() {
		System.out.print("������ �Է� : ");
		String teamName = in.next();
		if (team.containsKey(teamName)) {
			Hashtable<String, Player> ht = team.get(teamName);
			System.out.print("�������� �Է� : ");
			String name = in.next();
			if (ht.containsKey(name)) {
				Player edit = ht.get(name);
				System.out.println("���� ������ " 
								+ edit.getSalary()+"�� �Դϴ�.");
				System.out.print("�����Ͻ� ������ : ");
				edit.setSalary(in.nextInt());
				System.out.println("���� �������� " 
						+ edit.getPosition() +"�Դϴ�.");
				System.out.print("�����Ͻ� �������� : ");
				edit.setPosition(in.next());
				System.out.println(edit.getName()+
						"���� ������ �������� �����Ͽ����ϴ�.");
			}else {
				System.out.println("�������� �߸� �Է��ϼ̽��ϴ�.");
			}
		}else {
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			edit();
		}

	}

	@Override
	public void delete() {
		System.out.print("������ �Է� : ");
		String teamName = in.next();
		if (team.containsKey(teamName)) {
			Hashtable<String, Player> ht = team.get(teamName);
			System.out.print("�������� �Է� : ");
			String name = in.next();
			if (ht.containsKey(name)) {
				ht.remove(name);
				System.out.println(teamName+"���� " 
								+ name+"������ �����Ͽ����ϴ�.");
			}else {
				System.out.println("�������� Ʋ�Ƚ��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}else {
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			delete();
		}

	}

	@Override
	public void view() {
		System.out.print("������ �Է� : ");
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
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			view();
		}
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.!!");
		System.exit(0);
	}

}














