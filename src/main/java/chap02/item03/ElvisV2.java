package chap02.item03;

/**
 * 정적 팩터리 메서드를 public static 멤버로 제공하는 방식의 싱글턴
 */
public class ElvisV2 {
    private static final ElvisV2 INSTANCE = new ElvisV2();
    private ElvisV2() {}

    public static ElvisV2 getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
    }

}
