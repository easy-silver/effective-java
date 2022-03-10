package chap02.item01;

/**
 * 아이템1
 * 생성자 대신 정적 팩터리 메서드를 고려하라
 */
public class StaticFactoryMethod {

    public static void main(String[] args) {
        //static factory method 예시
        Boolean true1 = Boolean.valueOf(true);
        Boolean true2 = Boolean.valueOf(true);

        System.out.println("true1 = " + System.identityHashCode(true1));
        System.out.println("true2 = " + System.identityHashCode(true2));
    }

}
