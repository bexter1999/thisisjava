package sec02.exam05_static_method;

public interface RemoteControl {           //인터페이스 = Tv 말고 리모콘같은 개념 인터페이스는 명칭을 통일 시켜줌 실행을 위한 것이 아닌
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드                     {} 실행가로 붙이면 오류  인터페이스는 
	void turnOn();
	void turnOff();
	void setVolume(int volume);     
	
	//디폴트 메소드
	default void setMute(boolean mute) {          //default를 적으면 실행내용을 기입 가능
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	static void changesBattery() {
		System.out.println("건전지를 교환합니다");
	}
}
