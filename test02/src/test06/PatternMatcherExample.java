package test06;

import java.util.regex.Pattern;

//PatternMatcherExample.java
	public class PatternMatcherExample {
		public static void main(String[] args) {
			String id = "5Angel1004";
			String regExp = "[a-zA-z][a-zA-Z0-9] {7,11}";
				boolean isMatch = Pattern.matches(regExp, id);
					if(isMatch) {
						System.out.println("ID 로 사용할 수 있습니다");
					} else {
						System.out.println("ID 로 사용할 수 없습니다");
					}
			}
}
