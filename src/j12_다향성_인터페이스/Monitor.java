package j12_다향성_인터페이스;

public class Monitor implements HDMI {

	@Override
	public void connect() {
		System.out.println("HDMI 케이블을 통해 모니터를 연결.");

	}
	@Override
    public void disConnect() {
        System.out.println("HDMI 케이블에 연결된 모니터를 해제. ");

    }

    @Override
    public void soundOutput() {
        System.out.println("HDMI를 통해 소리 출력");
    }

}
