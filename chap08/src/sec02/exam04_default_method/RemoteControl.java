package sec02.exam04_default_method;

import javax.swing.plaf.basic.DefaultMenuLayout;

public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드                     {} 실행가로 붙이면 오류  인터페이스는 
	void turnOn();
	void turnOff();
	void setVolume(int volume);     
	
	default void setMute(boolean mute) {          //default를 적으면 실행내용을 기입 가능
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 헤제합니다.");
		}
	}
}
