package sast.example2;

public class Hurracan extends Lamborghini {
    public Hurracan() {
        this.brand = "Hurracan";
        this.parent = "Lamborghini";
    }
    public static Lamborghini getParent() {
        return new Lamborghini();
    }
}
