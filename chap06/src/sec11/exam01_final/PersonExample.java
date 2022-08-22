package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {                   //final은 객체마다 선언해줌 static은 클래서 전체에 적용
		Person p1 = new Person("123456-1234567", "계백");
		Person p2 = new Person("901109-1234567", "을지문덕");     //객체마다 선언이기 때문에 이렇게 바꾸는것이 가능함.
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";
		//p1.ssn = "654321-7654321";
		p1.name = "을지문덕";
	}

}
