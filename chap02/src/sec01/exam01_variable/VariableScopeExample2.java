package sec01.exam01_variable;

public class VariableScopeExample2 {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
			}
//		int v3 = v1 + v2;
//		위의 v2가 if절 안에 범위하지 않기 때문에 값이 안나옴 v2변수를 사용할 수 없기 때문에 컴파일 에러가 생김
		int v3 = v1+ v1 + 5;
		System.out.println(v3);
	}
}