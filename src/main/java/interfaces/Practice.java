package interfaces;

import java.util.List;

public interface Practice {
//    String name; 초기화 불가? 이유는?
    final String NAME = "name";
    static String HI = "hi";

    List<String> findAllName();

    /**
     * @implSpec
     */
    default void printName() {
        System.out.println(NAME);
    }

    static void printName2() {
        System.out.println(NAME);
    }
}
