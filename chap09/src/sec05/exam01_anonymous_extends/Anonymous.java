package sec05.exam01_anonymous_extends;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
		
	};
	
	void method1() {               //메소드안에 필드를 선언하면 필드가 아니라 변수가 됨 
		 //익명구현 객체를 변수로 메소드에서 사용
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
			
		};
		// 로컬변수를 사용하고 있는 현장
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
