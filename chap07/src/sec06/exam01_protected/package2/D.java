package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class D extends A{           //extends로 상속하니 컴파일 에러 발생X
	public D(){
		super();
		this.field = "value";
		this.method();
	}	
}
