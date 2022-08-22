package sec02_exam02_switch;

import java.util.regex.Matcher;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// 8<= ... <12(8+4) 사이의 정수 얻기
		int time = (int)(Math.random()*4) +8;                    //최소 8 ~ 11 까지 나옴
		System.out.println("[현재시간: " + time + "시]");

		switch(time) {
			case 8:
				System.out.println("출근합니다");                     //break가 없어서 8시가 뜨면 출근, 회의, 업무, 외근 다 뜸
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다");
			default:
				System.out.println("외근을 나갑니다.");
		}
	}

}
