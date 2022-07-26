package sec04.exam01_arithmetic;

public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		String userInput = "NaN";             //not a number, 숫자이면 false
		double val = Double.valueOf( userInput); 
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);

	}

}
