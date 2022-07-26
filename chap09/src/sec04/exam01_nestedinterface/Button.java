package sec04.exam01_nestedinterface;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener{
		void onClick();         //추상 메소드 실행 괄호가 없음
	}
	
}

