package interfaces;

import java.util.*;

public class Main {
    static {
        System.out.println(Practice.NAME);
        System.out.println(Practice.HI);
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        Practice.printName2();

        Practice practice = new Doit();
        practice.printName();

        Practice.printName2();

        System.out.println(practice.findAllName());
    }
}
