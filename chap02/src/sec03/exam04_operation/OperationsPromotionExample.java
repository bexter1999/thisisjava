package sec03.exam04_operation;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;                             //byte + byte = int (byte X)
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;    //컴파일 에러
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;    //컴파일 에러
		int intValue2 = charValue1 + charValue2;                 //여기서 charValue1이 65로 변화?
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;          //더블이나 플룻으로 바꾸고  4.0으로 나눠줘야 소수점자리 표시 가능
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;      //컴파일 에러     int인데 4.0으로 나눠서 오류
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}

}
