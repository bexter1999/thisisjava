package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
			Parent parent = new Child();
			parent.field1 = "data1";
			parent.method1();
			parent.method2();
			/*
			parent.field2 = "data2";  //불가능
			parent.method3();	      //불가능
			*/
			
			Child child = (Child) parent;        //더 작은 데이터로 형변환
			child.field2 = "yyy";  //가능
			child.method3();       //가능		//자식에게 있던 method3 활용가능
	}

}
