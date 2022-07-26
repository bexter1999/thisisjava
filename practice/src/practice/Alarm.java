package practice;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 알람 맞추기 45분 전으로 //
		int h = 0;
		int m = 0;
		
		h = sc.nextInt();
		m = sc.nextInt();
		/*System.out.println(h + "시 " + m + "분"); */
		          // 23 59
			if(m<45) {
				h = h - 1;
				m = 60 - (45 - m);
				if(h<0) {
				h = 23;	
				}
				System.out.println(h + " " + m);
			}
			else {
				m = m - 45;
				System.out.println(h + " " + m);
			}
								
	}

}
