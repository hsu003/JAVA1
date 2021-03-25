package view2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public abstract class AbsView {
	protected String getKeyIneputString(String str){
		String input = JOptionPane.showInputDialog(str+"�Է�");
		return input;
	}
	
	@SuppressWarnings("resource")
	protected String getEnter(){
		Scanner sc = new Scanner(System.in);  //����Ű�� ���������� ��� �ñ����� �޼ҵ�
		return sc.nextLine();
	}
	
	protected void msg(String str){
		JOptionPane.showMessageDialog(null,str);
	}
	
	public abstract void show();
}
