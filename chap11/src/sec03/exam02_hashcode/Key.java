package sec03.exam02_hashcode;

import sec03.exam01_equals.Member;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key) obj;  //지금 전달받은 놈을 형 변환
			if(this.number == key.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
}