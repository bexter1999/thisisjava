package sec04.exam03_compare;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);   //true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);                           //false       int(소수점X)와 double(소수점O)은 대표격이라 같지만  float는 double보다 밑 
		System.out.println((float)v4 == v5);                    //true
		System.out.println((int)(v4*10) == (int)(v5*10));       //true
	}

}
