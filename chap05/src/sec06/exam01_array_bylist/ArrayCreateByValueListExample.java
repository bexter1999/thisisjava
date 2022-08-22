package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int [] scores = {83, 90, 87};                 //배열 선언 하는 것   = int scores []
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		int sum = 0;
		for(int i = 0; i<3; i++) {                   //i<=3 절대 안됨 3까지 세니까 4개 됨
			sum += scores[i];
		}
		System.out.println("종합: " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균: " + avg);
	}

}
