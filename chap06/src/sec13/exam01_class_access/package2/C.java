package sec13.exam01_class_access.package2;

import sec13.exam01_class_access.package1.B;

public class C {
	//A a;  //(X) package가 달라서 못불러오는데  A 클래스 접근 불가(컴파일 에러)
	B b;    //(O) package가 달라서 못불러오는데 ctrl + shift + o  -> import파일 불러와서 접근 가능
}

