package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		//�ڵ� �ڽ�
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());

		//�ڵ� ��ڽ�
		int value = obj;
		System.out.println("value: " + value);
		
		//����� �ڵ� ��ڽ�
		int result = obj + 100;
		System.out.println("result: " + result);
	}

}
