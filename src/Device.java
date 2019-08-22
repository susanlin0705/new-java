public class Device {
    String type;
    String brand;
    Double price;

    public Device(String type, String brand, Double price) throws IllegalArgumentException {
        this.type = type;
        this.brand = brand;
        this.price = price;
        if (this.type == null || this.brand == null || this.price == null) {
            throw new IllegalArgumentException("not working");
        } else {
            System.out.println("it work!");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
