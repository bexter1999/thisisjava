package sec03.exam04_break;

import java.util.regex.Matcher;

public class BreakExample {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) + 1;   //1~6까지
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
			System.out.println("프로그램 종료");
	}

}
