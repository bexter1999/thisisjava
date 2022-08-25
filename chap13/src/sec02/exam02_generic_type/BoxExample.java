package sec02.exam02_generic_type;

import sec02.exam01_none_generic_type.Box;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box1  = new Box<String>();
		box1.set("ȫ�浿");
		String name = (String) box1.get();
		
		Box<Integer> box2  = new Box<Integer>();
		box2.set(5);
		int value = (Integer) box2.get();

	}

}
