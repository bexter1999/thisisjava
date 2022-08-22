package chap04.sec02_Exam01_if;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score<90)    //{                     //중가로가 없음 -> if절 이후 다음 첫줄까지 중가로가 자동으로 생성  그러므로 등급은 B입니다 출력됨 => if절 한줄은 가로 생략가능
			System.out.println("점수가 90보다 작습니다.");
		            //}
		System.out.println("등급은 B입니다.");
		
	}

}
