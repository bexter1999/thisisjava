package sec11.exam01_final;

public class Person {   //static 은 공통변수 사용
	// 하나만 생성이 가능하며 static과 비슷하지만 객체를 절대절대 바꿀 수 없음(객체마다 선언) //String은 태초에 자바에서 만든 변수 타입이라서 처음에 대문자 int와 double과는 다르게
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
