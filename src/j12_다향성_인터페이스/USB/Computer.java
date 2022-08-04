package j12_다향성_인터페이스.USB;

import j12_다향성_인터페이스.ConnectionTerminal;
import j12_다향성_인터페이스.HDMI;
import j12_다향성_인터페이스.VGA;

public interface Computer {
	
	private ConnectionTerminal connectionTerminal;
	private USB usb1;
	private USB usb2;

    public Computer(ConnectionTerminal connectionTerminal, USB usb1, USB usb2) {
        this.ConnectionTerminal = ConnectionTerminal;
        this.usb1 = usb1;
        this.usb2 = usb2;
    } 

    public void powerOn() {  
        System.out.println("컴퓨터의 전원을 켭니다");
        connectedDisplay();
        showConnectionTerminalVersion();
        if(usb1 !=null) usb1.connect();
        if(usb2 !=null) usb2.connect();
        soundOn();

    }

    public void powerOff() {
    	if(usb1 !=null) usb1.disConnect();
    	if(usb2 !=null) usb2.disConnect();
        disConnectedDisplay();
        System.out.println("컴퓨터의 전원을 끕니다.");
        
    }

    private void connectedDisplay() {
        System.out.println("출력 장치를 연결한다.");
        HDMI.connect();
    }

    private void disConnectedDisplay() {
        System.out.println("출력 장치 연결 해제.");
        HDMI.disConnect();
    }

    private void soundOn() {
        if(ConnectionTerminal instanceof HDMI) {
            ((HDMI) ConnectionTerminal).soundOutput();
            System.out.println(" 소리를 출력.");
        }else{
            System.out.println("연결된 스피커가 있다.");
        }
    }

    private void showConnectionTerminalVersion() {
        if(ConnectionTerminal instanceof HDMI) {
            System.out.println("HDMI Version: "+HDMI.VERSION);

        }else if(ConnectionTerminal instanceof VGA) {
            System.out.println("VGA Version: "+VGA.VERSION);

        }else {
            System.out.println("Version Information is missing");

        }
    }

}
