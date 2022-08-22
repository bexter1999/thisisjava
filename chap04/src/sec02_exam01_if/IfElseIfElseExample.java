package sec02_exam01_if;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 101;
		
		if(score>=101) {
			System.out.println("100점 만점입니다.");
			System.out.println("점수가 올바르지 않습니다.");
		} else if(score>=90) {
			System.out.println("점수가100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		} else  {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D입니다.");
		}
	}
}