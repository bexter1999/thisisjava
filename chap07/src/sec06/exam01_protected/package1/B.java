package sec06.exam01_protected.package1;

public class B {
	public void method() {
		A a = new A();			//A라는 클래스안에서 a라는 객체 생성
		a.field = "value";		//a라는 필드값에 밸류라고 집어넣음
		a.method();				//메소드도 사용   => 3개다 사용 가능 같은 패키지 안에 있는 자식이라서
	}
}
