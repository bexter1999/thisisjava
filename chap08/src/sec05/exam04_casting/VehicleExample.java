package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {

		Vehicle vehicle = new Bus();
		vehicle.run();
		//Bus bus = new Bus(); (x)
		/*Bus bus = (Bus) vehicle;*/ // ���� Ÿ�Ժ�ȯ
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}

}
