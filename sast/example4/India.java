package sast.example4;

public class India extends Country {
    private static String name = "India";
    public static String country() {
        return name;
    }
    public TamilNadu getState() {
        return new TamilNadu();
    }
}
