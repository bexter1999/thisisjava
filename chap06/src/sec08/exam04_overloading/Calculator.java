package sec08.exam04_overloading;

public class Calculator {             //리턴값이 있으므로 메소드임    그리고 클래스 명이 밑에 없으므로 생성자는 아니라는 것을 알 수 있음
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
