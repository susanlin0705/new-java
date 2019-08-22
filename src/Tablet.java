public class Tablet extends Device {

    protected boolean physicalKeyboard;
    public Tablet(String type, String brand, Double price, boolean physicalKeyboard) throws IllegalArgumentException {
        super(type, brand, price);
    }
}
