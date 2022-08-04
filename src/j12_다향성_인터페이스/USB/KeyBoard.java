package j12_다향성_인터페이스.USB;

public class KeyBoard implements USB{
	
	@Override
	public void connect() {
		System.out.println("키보드를 연결");
	}
	
	@Override
	public void connect() {
		System.out.println("키보드 연결 해제");
	}

}
