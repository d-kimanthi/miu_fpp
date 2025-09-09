package lab4.problem1;

public class TestClass {
    public static void main(String[] args) {
        Product[] products = {new Clothing("Pants",75, "Zara",5),
                              new Electronics("Refrigerator",500, 24, 70),
                              new Furniture("Desk",300, "wood", 50),
                              new Furniture("Chair",120,"Plastic",40),
                              new Electronics("Microwave",130,12,40)
                             };

        for (Product p : products) {
            System.out.println(p.toString());
        }

        System.out.println("Sum of all products price: $" + sumProducts(products));
    }

    public static double sumProducts(Product[] col) {
        double totalProductsPrice = 0;
        for (Product p : col){
            totalProductsPrice += p.getPrice();
        }
        return totalProductsPrice;
    }
}
