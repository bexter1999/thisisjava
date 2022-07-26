package sec07.exam02_default_method_extends;

public class DefaultMethodExtendsExample {

	public static void main(String[] args) {
		
		ChildInterface1 ci1 = new ChildInterface1() {
			@Override
			public void method1() {}
			@Override
			public void method3() {}
		};
		
		ci1.method1();
		ci1.method2(); //Child Interface2의 method2() 호출
		ci1.method3();
		
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {}
			@Override
			public void method3() {}
		};
		
		ci1.method1();
		ci1.method2(); //Child Interface2의 method2() 호출
		ci1.method3();
		
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {}
			@Override
			public void method2() {}
			@Override
			public void method3() {}
		};
		
		ci1.method1();
		ci1.method2(); //Child Interface2의 method2() 호출
		ci1.method3();
		
		
		}
		

	}

