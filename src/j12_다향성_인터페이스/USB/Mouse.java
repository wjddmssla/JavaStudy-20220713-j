package j12_다향성_인터페이스.USB;

public class Mouse implements USB{
	
	@Override
	public void connect() {
		System.out.println("마우스 연결");
		
	}
	
	@Override
	public void disConnect() {
		System.out.println("마우스연결 해체");
	}

}
