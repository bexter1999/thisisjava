package sec13.exam02_constructor_access.package1;

public class C {
	//필드
	A a1 = new A(true);			// (O)
	A a2 = new A(1);			// (O) 패키지 바꾼 D에서는 default 생성자 접근 불가 (컴파일 에러)
	//A a3 = new A("문자열"	);	// (X) Private 생성자 접근 불가 (컴파일 에러)
}
