package J12_다향성2;

public class KakaoTalk implements Messenger{ //out

	@Override
	public void send() {
		System.out.println("카카오톡을 보냅니다.");
		
	}

	@Override
	public void receive() {
		System.out.println("새로운 카카오톡이 왔습니다.");
		
	}
	
	public void sendPresent() {
		System.out.println("카카오톡으로 선물을 보냅니다.");
	}



}
