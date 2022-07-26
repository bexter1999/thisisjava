package sec03;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {               //나머지가 0이 아니다 = 홀수는 제외하고 지속   // 나머지가 1이 아니다 = 짝수는 제외하고 지속
				continue;
			}
			System.out.println(i);
		}

	}

}
