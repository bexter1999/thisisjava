package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 익명 구현 객체
		RemoteControl rc = new RemoteControl() {		//인터페이스는 객체생성이 불가능하다!! 그래서 익명 구현 객체생성 한거임
			public void turnOn() {/*실행문*/}					//원래는 
			public void turnOff() {/*실행문*/}
			public void setVolume(int volume) {/*실행문*/}
		};

	}

}
