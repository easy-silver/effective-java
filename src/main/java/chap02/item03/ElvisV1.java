package chap02.item03;

/**
 * public static 멤버가 final 필드인 방식의 싱글턴
 */
public class ElvisV1 {
    public static final ElvisV1 INSTANCE = new ElvisV1();
    private ElvisV1() {}

    public void leaveTheBuilding() {

    }

}
