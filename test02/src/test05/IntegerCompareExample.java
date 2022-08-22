package test05;

public class IntegerCompareExample {

	public static void main(String[] args) {
		
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 500;
		
		System.out.println( obj1 == obj2);
		System.out.println( obj3 == obj4);

	}
	
}

//포장 클래스  Integer는 -128~127사이의 숫자는 등호 두개로 내부의 값을 비교할 수 있다
//따라서 100은 범위 안에 해당하기 때문에 true값을 반환하고 300은 범위를 넘기 떄문에 등호 두개로 비교할 수 없고 포장클래스의 내부값을 비교하도록
//오버라이딩된 이퀄스로 비교해야한다
