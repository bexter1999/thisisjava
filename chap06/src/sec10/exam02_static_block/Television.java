package sec10.exam02_static_block;

public class Television {
		int feild1;

		private int field1;
	
		static String company = "Samsung";
		static String model = "LCD";
		static String info;
		//static String info = company + "-" + model;	  	//static block표시방법 말고 이렇게 써도 똑같음
		
		static {                          
			//field1 = 10; (안됨)							//static은 고정된 값이라 변경 안됨 (아래에 있는 메소드2도 마찬가지) //static 안에 선언한게 안된다는 점!!
			//method 1();  (안됨)
			info = company + "-" + model;					//static block으로 표시한 방법
		}
		
	/*	static void method() {								//static 변수는 객체의 영향을 받지 않는다
			obj1.company = Television ("LG전자")   			//객체를 만들어도 영향받지 않으며 객체를 만들지 않아도 실행됨   실행클래스에서 객체 만듬(6, 7행)
		}*/
		
		void method1() {
		}
		
		static void method2() { 							//static은 고정된 값이라 변경 안됨 				static 안에 선언한게 안된다는 점!!
		//this.field1 = 10; (안됨)
		//this.method1();   (안됨)
		}
		static void method3() {                             //객체를 실행함수에서 만들지 않고 여기서 만들면 static이지만 유일한 객체생성 방법
			Television obj = new Television ();
			obj.field1 = 10;
			obj.method1();
		}
}