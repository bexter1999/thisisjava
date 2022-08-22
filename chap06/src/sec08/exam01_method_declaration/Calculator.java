package sec08.exam01_method_declaration;

public class Calculator {
	//메소드       리턴값이 있을 수도 있고 없을 수도 있음 만약 리턴값없으면 void 붙여야함      생성자는 리턴값이 절대 없음
	void powerOn() {                              //리턴값없으니 void
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {          //인트로 받는다고 하고 리턴값없으면 컴파일에러
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
