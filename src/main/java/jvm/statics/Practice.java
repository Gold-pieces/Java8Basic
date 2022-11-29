package jvm.statics;

public class Practice {
    public static String STATIC_MESSAGE = "응애";

    static {
        System.out.println("I'm Loading");
        System.out.println(STATIC_MESSAGE + "2");
    }
}
