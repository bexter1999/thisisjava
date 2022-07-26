package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "½Å¹ÎÃ¶";
		String strVar2 = "½Å¹ÎÃ¶";
		String strVar3 = new String("½Å¹ÎÃ¶");
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));          //equals ¸ğ¾ç/ÇüÅÂ¸¸ °°À¸¸é true (½Å¹ÎÃ¶=½Å¹ÎÃ¶)
		System.out.println( strVar1.equals(strVar3));
	}

}
