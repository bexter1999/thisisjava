package sec12.exam01_wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		//원래 이게맞음 객체끼리는 같을 수가 없다
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2));
		System.out.println("언박싱 후 == 결과: " +(obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2));
		System.out.println("==================================================");
		//근데 인티저 -128~127일때는 같다고 해줌
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4));
		System.out.println("언박싱 후 == 결과: " +(obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));

	}

}
