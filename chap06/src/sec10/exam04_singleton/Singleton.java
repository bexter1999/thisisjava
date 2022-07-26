package sec10.exam04_singleton;

public class Singleton {
	//객체를 하나 밖에 선언하지 못함.        private = 외부에서 접근 금지  /  public = 외부에서 접근 가능
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}                 // =생성자   클래스와 이름이 같고 리턴값이 없음
	
	static Singleton getInstance() {
		return singleton;
	}
}
