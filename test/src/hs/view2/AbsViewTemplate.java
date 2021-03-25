package view2;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

public abstract class AbsViewTemplate extends AbsView {

	@Override
	public void show() {
		showMenu();
		String input = getKeyIneputString("��ȣ");
		
		if(isValidNumber(input)){
			//execute(Integer.parseInt(input));
			execute(NumberUtils.toInt(input));
		}

	}
	
	protected boolean isValidNumber(String str){
		if(StringUtils.isBlank(str)){   //���� ���� �����̳� ����� Ŭ����
			return false;
		}
		if(!StringUtils.isNumeric(str)){//���� ���� ���ڰ� �ƴϳ� ����� Ŭ����
			return false;
		}
		int num = NumberUtils.toInt(str);//String Ÿ���� int Ÿ������ ���� ���ִ� ��ƿ
		if(num<getMinMenuNumber() || num>getMaxMenuNumber()){
			return false;
		}
		return true;
	}
	
	protected abstract void showMenu();
	protected abstract int getMaxMenuNumber();
	protected abstract int getMinMenuNumber();
	protected abstract void execute(int number);
}
