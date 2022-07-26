package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;           //import 시켜도 컴파일에러 발생

public class C {
	public void method() {
		/*		
		 	A a = new A();			//A라는 클래스안에서 a라는 객체 생성
			a.field = "value";		//a라는 필드값에 밸류라고 집어넣음
			a.method();				//메소드도 사용   => 3개다 사용 가능 같은 패키지 안에 있는 자식이라서
		*/	 						//사용하려면 상속하면 됨
	}	
}
