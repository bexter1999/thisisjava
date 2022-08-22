package sec06.exam02_array_bynew;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3];             //new int[3] => 방 3개 만들어                      배열 방법 2가지임! bylist랑
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] :" + arr1[i]);                //여기는 값 입력 전이라서 디폴트값 0이뜨고 더블은 소수점 스트링은 null뜸
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] :" + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] :" + arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] :" + arr2[i]);
		}
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] :" + arr3[i]);
		}
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] :" + arr3[i]);
		}
	}

}
