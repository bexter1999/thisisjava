package test05;

public class ShopService {
	private static ShopService singleton = new ShopService();
	private ShopService(){}; /*½Ì±ÛÅæÀº private·Î »ý¼ºÀÚ¸¦ ¸¸µë*/
	public static ShopService getInstance() {
		return singleton;
	}
}
