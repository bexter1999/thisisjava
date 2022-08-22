package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strvar1 = "남상권";
		String strvar2 = "남상권";		
		if(strvar1 == strvar2) {
			System.out.println("strvar1과 strvar2는 참조가 같음");
		} else {
			System.out.println("strvar1과 strvar2는 참조가 다름");
		}
		if(strvar1.equals(strvar2)) {
			System.out.println("strvar1과 strvar2는 문자열이 같음");
		}
		String strvar3 = new String("남상권");
		String strvar4 = new String("남상권");
		if(strvar3 == strvar4) {                                     //실제로는 힙에 저장되며 ?? 메모리주소는 다른걸 참조//
			System.out.println("strvar3과 strvar4는 참조가 같음");
		} else {
			System.out.println("strvar3과 strvar4는 참조가 다름");
		}
		if(strvar3.equals(strvar4)) {
			System.out.println("strvar3과 strvar4는 문자열이 같음");
		}
	}
}
