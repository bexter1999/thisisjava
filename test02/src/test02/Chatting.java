package test02;

//Chatting.java
public class Chatting {
	
	public static void main(String[] args) {
	void startChat(String chatId) {
		//Chat�̶�� ���� Ŭ�������� nickName�̶���ϴ� ���ú����� ����ϰ� ������ nickName�� final Ư���� ���� ������
		//�Ʒ��� �ڵ�ó�� �ѹ� ���� �ָ� ������ �� ���� �׷��� �̷��� (String nickName = chatId)�� �����ؾ��Ѵ�.
			String nickName = chatId;
			nickName = chatId;

			
			Chat chat = new Chat() {
					@Override
					public void start() {
						while(true) {
							String inputData = "�ȳ��ϼ���";
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