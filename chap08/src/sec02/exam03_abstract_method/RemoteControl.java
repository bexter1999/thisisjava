package sec02.exam03_abstract_method;

public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드                     {} 실행가로 붙이면 오류  인터페이스는 
	void turnOn();
	void turnOff();
	void setVolume(int volume);        //void 앞에 defalut 적어주면 {} 사용 가능
}
