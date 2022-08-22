package sec04.exam01_objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {

		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null)); //둘다 널일때도 트루가 나옴 조심
		System.out.println(Objects.deepEquals(o1, o2)+ "\n");
		
		Integer[] arr1= {1,2};
		Integer[] arr2= {1,2};
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2)); //배열일때는 deepEquals를 사용해야됨
		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null)); //둘다 널일때도 트루가 나옴 조심
		System.out.println(Objects.deepEquals(null,null));
		
	}

}
