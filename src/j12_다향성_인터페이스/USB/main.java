package j12_다향성_인터페이스.USB;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String select = null;

        System.out.println("[컴퓨터 연결 관리]");
        System.out.println("1. 모니터 연결");
        System.out.println("2. 빔프로젝트 연결");
        System.out.print("선택 >>");

        select = scanner.nextLine();

        if(select.equals("1")) {
            connectionTerminal = new Monitor();
        }else if(select.equals("2")) {
            connectionTerminal = new BeamProject ();
        }else {
            System.out.println("메뉴를 잘못 선택.");
        }

        Computer computer = new Computer(monitor);

        computer.powerOn();

        for(int i=0; i<10; i++) {
            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }

        }

        computer.powerOff();
	}

}
