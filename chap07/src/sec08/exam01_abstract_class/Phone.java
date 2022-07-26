package sec08.exam01_abstract_class;

public abstract class Phone {						//new Phone 객체 생성 불가능 자식 객체를 통해서만 구현 가능
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
