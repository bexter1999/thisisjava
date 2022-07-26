package sec08.exam01_method_declaration;

import org.omg.CORBA.portable.ValueInputStream;

public class Computer {
	int sum1(int[] values) {                // = int sum1(int ... values)   "...가능!!!"
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {                // = int sum1(int[] values)   "...가능!!!"
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
