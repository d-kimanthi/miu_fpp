package lab4.problem1;

public class Clothing extends Product {

    private String brand;
    private double discount;

    public Clothing(String name, double price, String brand, double discount){
        super(name, price);
        this.brand = brand;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * ((100 - discount)/100);
    }

    @Override
    public String toString() {
        return "Clothing { name = "+ getProductName() + ", price= "+ getPrice() + ", brand= " + brand +", discount= " + discount + "}";
    }
}
