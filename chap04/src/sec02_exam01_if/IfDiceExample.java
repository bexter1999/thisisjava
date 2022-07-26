package sec02_exam01_if;

public class IfDiceExample {

	public static void main(String[] args) {
		int num =(int)(Math.random()*6) +1;
		
		if(num==1) {
			System.out.println("1번이 나왔습니다");
		}else if(num==2) {
			System.out.println("2번이 나왔습니다");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다");
		}else {                                     //else는 그외 모든 조건을 포함하기 때문에 ()=조건을 기입하면 안됨
			System.out.println("6번이 나왔습니다");
		}

	}

}
