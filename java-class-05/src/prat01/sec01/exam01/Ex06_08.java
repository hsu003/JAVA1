package prat01.sec01.exam01;

public class Ex06_08 {

	public static void main(String[] args) {

				int i;
				int hap=0;      //자바는 변수 선언하고 초기값 안주면 에러가 난다.
				//hap=1+2+3+4+5+6+7+8+9+10;
				
				for(i=1;i<=10;i++) {     //값을 누적 시킬경우에는 변수의 값을 초기화 시켜야 한다.
					hap=hap+i;   //복합대입 연산자
					//hap+=hap;
		
				}
				System.out.printf("1에서 10까지의 합 :%d \n",hap);

			}

		


	}


