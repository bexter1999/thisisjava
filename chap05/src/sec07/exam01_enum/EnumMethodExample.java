package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		//name() 메소드   : 안의 컨텐츠 실제 내용?
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal () 메소드  : sunday가 몇번째 있어?(전체중에서) 0부터 세기때문에 6이 나옴
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드   :  result1 = day2를 기준(전체X)으로 day1이 어디에 있나?   day2 = 2 | day1 = 0   => -2  가로 안에 있는게 기준!!!!!!!!
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드         : 문자열 비교 (.equals 와 같음)
		Week weekday = Week.valueOf("MONDAY");
		 if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
		 	System.out.println("주말 이군요");
		 } else {
		 	System.out.println("평일 이군요");
		 }  
		
		
		/*if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요");
			} else {
				System.out.println("평일 이군요");
			}
		}*/
		
		//values() 메소드        :     week.enum의 값(values)들을 포문으로 돌림
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
