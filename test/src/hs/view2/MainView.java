package view2;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainView extends AbsViewTemplate {
	private SelectTeamView selectTeamView;
	
	public void setSelectTeamView(SelectTeamView selectTeamView) {
		this.selectTeamView = selectTeamView;
	}

	@Override
	protected void showMenu() {
		System.out.println("********************");
		System.out.println();
		System.out.println("1. ����");
		System.out.println("2. �� ����Ʈ");
		System.out.println("3. ���� �߰�");
		System.out.println();
		System.out.println("********************");
		System.out.println("��ȣ �Է�(Enter)");

	}

	@Override
	protected int getMaxMenuNumber() {
		return 3;
	}

	@Override
	protected int getMinMenuNumber() {
		return 1;
	}

	@Override
	protected void execute(int number) {
		switch(number){
		case 1 :
						msg("���α׷��� �����մϴ�.");
						System.exit(0);
		case 2 :
						selectTeamView.show();
						break;
		case 3 :
		}
	}

	public static void main(String[] args){
		GenericApplicationContext ac = 
				new GenericXmlApplicationContext("appContext.xml");
		MainView mu = (MainView)ac.getBean("mainView");
		while(true){
			mu.show();
		}
	}
}

