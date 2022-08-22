package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Child child1 = new Child();			//얘 덕분에 15라인 호출 가능
		Parent parent = child;
		
		parent.method1();
		
		parent.method2();                      //@override 어노테이션때문에 child가 실행됨 (=다 읽고 추가적으로 읽는 것이 어노테이션이라서?)
		
		//parent.method3(); (호출 불가능)			//형변환해서 호출 불가능
		child1.method3();  //(호출 쌉가능)			//child1 객체를 더 만들어줘서
	}

}
