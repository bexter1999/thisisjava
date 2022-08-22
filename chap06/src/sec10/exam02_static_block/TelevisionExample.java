package sec10.exam02_static_block;

public class TelevisionExample {

	public static void main(String[] args) {
		/*Television myCar = new Television();              가능
		myCar.field1 = 60;
		myCar.method1();*/
		Television obj1 = new Television();
		Television obj2 = new Television();
		obj1.company = "LG전자";
		System.out.println(Television.info);

	}

}
