package sec05.exam01_exit;

public class GcExample {

	public static void main(String[] args) {

		Employee emp;
		
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.println("emp가 최정족으로 참조하는 사원번호: ");
		System.out.println(emp.eno);
		System.gc();

	}

}
