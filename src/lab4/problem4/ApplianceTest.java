package lab4.problem4;

public class ApplianceTest {
    public static void main(String[] args) {
        Appliances[] appliances = {
            new WashingMachine(7),
            new Refrigerator(4),
            new Microwave(800)
        };
        for (Appliances appliance : appliances) {
            System.out.println(appliance.getClass().getSimpleName());
            appliance.performFunction();
        }
    }
}
