package lab2.problem4;

public class Pizza {
    PizzaSize pizzaSize;
    PizzaType pizzaType;
    int quantity;

    private float price;

    public Pizza(PizzaSize pizzaSize, PizzaType pizzaType, int quantity){
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    private void calculatePrice(){
        float sizePrice = switch (this.pizzaSize){
            case SMALL -> 8;
            case MEDIUM -> 10;
            case LARGE -> 12;
        };

        float typePrice = switch (this.pizzaType){
            case VEGGIE -> 1;
            case PEPPERONI -> 2;
            case CHEEZE -> 1.5f;
            case BBQCHICKEN -> 2;
        };

        this.price = (sizePrice + typePrice) * this.quantity;
    }

    public String printOrderSummary(){
        calculatePrice();
        float tax = this.price * 0.03f;
        return String.format(
                """
                        *************************\s
                        Pizza Order
                        Size: %s
                        Type: %s
                        Qty: %d
                        Price: $%.2f
                        Tax: $%.2f
                        Total Price: $%.2f
                        *************************
                        """,
                this.pizzaSize,
                this.pizzaType,
                this.quantity,
                this.price,
                tax,
                this.price + tax
        );
    }
}
