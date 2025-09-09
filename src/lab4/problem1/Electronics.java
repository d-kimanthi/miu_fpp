package lab4.problem1;

public class Electronics extends Product {
    private int warrantyMonths;
    private double warrantyCost;

    public Electronics(String name, double price, int warrantyMonths, double warrantyCost){
        super(name,price);
        this.warrantyMonths = warrantyMonths;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + warrantyCost;
    }

    @Override
    public String toString() {
        return "Electronics { name = "+ getProductName() + ", price= $"+ getPrice() + ", warrantyMonths= " + warrantyMonths +", warrantyCost= " + warrantyCost + "}";
    }
}
