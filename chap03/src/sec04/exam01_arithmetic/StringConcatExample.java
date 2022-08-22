package sec04.exam01_arithmetic;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);

		String str3 = "JDK" + 3 + 3.0;               //처음에 문자라서 문자로 인식된 상태에서 문자로 더해짐   
		String str4 = 3 + 3.0 + "JDK";               //처음에 숫자라서 숫자계산하고 문자가 뒤에 붙음               위치차이
		System.out.println(str3);
		System.out.println(str4);
	}

}
