package sec03.exam02_casting2;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		int i = 128;                                            // -128~127 사이만 인식가능 byte는 
		
		if ( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {        
			System.out.println("byte 타입으로 변환할 수 없습니다");
			System.out.println("값을 다시 확인해 주세요");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}

	}

}



//or => 하나라도 true면 true임