package sast.example4;

public class ChennaiHelper {
    private Chennai city;
    public ChennaiHelper(Chennai chennai) {
        this.city = chennai;
    }
    
    public String getCountryName() {
        return city.getCountry().country();
    }
}
