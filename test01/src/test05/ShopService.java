package test05;

public class ShopService {
	private static ShopService singleton = new ShopService();
	private ShopService(){}; /*�̱����� private�� �����ڸ� ����*/
	public static ShopService getInstance() {
		return singleton;
	}
}
