package sec06.exam06_array_reference;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println( strArray[0] == strArray[1]);        //같은 주소를 참조
		System.out.println( strArray[0] == strArray[2]);        //new선언하면 달라짐 주의!
		System.out.println( strArray[0].equals(strArray[2]));   //모양 같냐?
		

	}

}
