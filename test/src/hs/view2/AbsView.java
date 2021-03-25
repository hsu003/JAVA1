package view2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public abstract class AbsView {
	protected String getKeyIneputString(String str){
		String input = JOptionPane.showInputDialog(str+"입력");
		return input;
	}
	
	@SuppressWarnings("resource")
	protected String getEnter(){
		Scanner sc = new Scanner(System.in);  //엔터키를 받을때까지 대기 시기위한 메소드
		return sc.nextLine();
	}
	
	protected void msg(String str){
		JOptionPane.showMessageDialog(null,str);
	}
	
	public abstract void show();
}
