package sec02.exam06_boolean;

public class BooleanExample {

	public static void main(String[] args) {
		//boolean stop = false   => 시작합니다.
		boolean stop = true;                       //true->false로 변경 시 "시작합니다."출력됨
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}

	}

}
