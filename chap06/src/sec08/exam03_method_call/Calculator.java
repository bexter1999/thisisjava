package sec08.exam03_method_call;

import javax.print.attribute.standard.PrinterLocation;

public class Calculator {
	//필드    없슴
	//생성자 없슴
	//메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
