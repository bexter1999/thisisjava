package test02;

//Chatting.java
public class Chatting {
	
	public static void main(String[] args) {
	void startChat(String chatId) {
		//Chat이라는 로컬 클래스에서 nickName이라고하는 로컬변수를 사용하고 있으면 nickName은 final 특성을 갖기 때문에
		//아래의 코드처럼 한번 값을 주면 변경할 수 없다 그래서 이렇게 (String nickName = chatId)로 수정해야한다.
			String nickName = chatId;
			nickName = chatId;

			
			Chat chat = new Chat() {
					@Override
					public void start() {
						while(true) {
							String inputData = "안녕하세요";
							String message = "[" + nickName + "] " + inputData;
							sendMessage(message);
						}
					}	
			};	
			chat.start();
	}
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
	
}

}