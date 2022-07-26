package sec04.exam01_arithmetic;

public class OverFlowExample {

	public static void main(String[] args) {
		/*
		 * int x = 1000000;             int의 범위값을 넘어서 쓰레기값이 나옴
		 * int y = 1000000;             그래서 더 넓은 범위값을 가진 long으로 계산해야함
		 * int z = x * y;
		 * system.out.printl(z)
		 */

		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}

}
