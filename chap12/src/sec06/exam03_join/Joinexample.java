package sec06.exam03_join;

public class Joinexample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
		sumThread.join();
		}	catch (InterruptedException e) {}
		
		System.out.println("1100 гу: " + sumThread.getSum());
	}

}
