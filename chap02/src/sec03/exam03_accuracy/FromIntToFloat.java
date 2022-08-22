package sec03.exam03_accuracy;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;         // num 3 = 123456780    float을 더 넓은 범위의 double로 바꾸면 0으로 나옴   -4는 쓰레기값
		num2 = (int) num3;         // num 
		
		int result = num1 - num2;
		System.out.println(result);

	}

}
