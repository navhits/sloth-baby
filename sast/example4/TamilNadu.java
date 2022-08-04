package sast.example4;

public class TamilNadu extends India {
    private static String name = "TamilNadu";
    public static String state() {
        return name;
    }
    public Chennai getCity() {
        return new Chennai();
    }
}
