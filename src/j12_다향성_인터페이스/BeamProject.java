package j12_다향성_인터페이스;

public class BeamProject implements VGA {

    @Override
    public void connect() {
        System.out.println("VGA 케이블을 통해 빔프로젝트를 연결.");

    }

    @Override
    public void disConnect() {
        System.out.println("VGA 케이블에 연결된 빔프로젝트 연결을 해제.");
    }
}
