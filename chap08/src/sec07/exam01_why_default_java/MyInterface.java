package sec07.exam01_why_default_java;

public interface MyInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("MyInterface-method2 실행"); /*디폴트는 나중에 확장해도 문제가 없음*/
	}
}
