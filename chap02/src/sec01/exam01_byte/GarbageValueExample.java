package sec01.exam01_byte;

public class GarbageValueExample {

	public static void main(String[] args) {            //의도하지 않은 결과가 나온다.
		byte var1 = 125;
		int var2 =125;
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
		
	}

}
