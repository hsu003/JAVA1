package view2;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

public abstract class AbsViewTemplate extends AbsView {

	@Override
	public void show() {
		showMenu();
		String input = getKeyIneputString("번호");
		
		if(isValidNumber(input)){
			//execute(Integer.parseInt(input));
			execute(NumberUtils.toInt(input));
		}

	}
	
	protected boolean isValidNumber(String str){
		if(StringUtils.isBlank(str)){   //들어온 값이 공백이냐 물어보는 클래스
			return false;
		}
		if(!StringUtils.isNumeric(str)){//들어온 값이 숫자가 아니냐 물어보는 클래스
			return false;
		}
		int num = NumberUtils.toInt(str);//String 타입을 int 타입으로 형변 해주는 유틸
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
