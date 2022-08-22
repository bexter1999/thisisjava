package sec00;

public class FromOneToTen {

	public static void main(String[] args) {
	
		int total = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.print(i);
			total +=i;         //°°À½ total = total + i
			if(i!=10) {
				System.out.print("+");
			} 
		}
				System.out.print("=" + total);
	}
}			
		
		
		
		
		
		/*while (i<10) {
			i++; //0(1)
			total = total + i;         // 1 = 0 + 1
			System.out.print(i);
			if(i!=10) System.out.print("+");
		}
		System.out.print("="+total);
	}*/

