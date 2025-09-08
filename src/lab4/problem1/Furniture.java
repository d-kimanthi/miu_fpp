package lab4.problem1;

public class Furniture extends Product {
    private String material;
    private double shippingCost;

    public Furniture(String name, double price, String material, double shippingCost) {
        super(name,price);
        this.material = material;
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + shippingCost;
    }

    @Override
    public String toString() {
        return "Furniture { name = "+ getProductName() + ", price= "+ getPrice() + ", material= " + material +", shippingCost= " + shippingCost + "}";
    }
}
