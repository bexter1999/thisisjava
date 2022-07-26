package sec04.exam03_compare;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);          // 같다
		boolean result2 = (num1 != num2);          // 다르다
		boolean result3 = (num1 <= num2);          // 같거나 작다
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A';                          //A=65
		char char2 = 'B';                          //B=66
		boolean result4 = (char1 < char2);
		System.out.println("result4=" + result4);
	}

}
