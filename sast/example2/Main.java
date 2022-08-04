package sast.example2;

// Multi level inheritance
// Rule should match pattern of any variable of int type with value as 4 that originally is in Car class
// That is extended by Lamborghini class and Lamborghini class is extended by Hurracan class
// int $X = 4;
// In my understanding there should be 4 lines that should be identified
// 1. Parent class (1 occurence)
// 2. Main class where the class variable is assigned to a local variable in main method (3 occurence)

public class Main {
    public static void main(String[] args) {
        Car car1 = new Lamborghini();
        int wheelsInLamborghini = car1.getWheels();
        System.out.println(car1.brand + " has " + wheelsInLamborghini + " wheels");
        car1.setSeats(4);
        car1.setColor("red");
        System.out.println(car1.getFeatures());
        Hurracan car2 = new Hurracan();
        int wheelsInHurracan = car2.getWheels();
        System.out.println(car2.brand + " has " + wheelsInHurracan + " wheels");
        car2.setSeats(2);
        car2.setColor("black");
        System.out.println(car2.getFeatures());
        int wheelsInHurracanParent = car2.getParent().getWheels();
    }
}
