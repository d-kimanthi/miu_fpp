package lab4.problem4;

public class ApplianceTest {
    public static void main(String[] args) {
        Object[] appliances = {
            new WashingMachine(7),
            new Refrigerator(4),
            new Microwave(800)
        };
        for (Object appliance : appliances) {
            if (appliance instanceof WashingMachine) {
                WashingMachine wm = (WashingMachine) appliance;
                System.out.println(wm.getClass().getSimpleName());
                wm.performFunction();
            } else if (appliance instanceof Refrigerator) {
                Refrigerator fridge = (Refrigerator) appliance;
                    System.out.println(fridge.getClass().getSimpleName());
                    fridge.performFunction();
            } else if (appliance instanceof Microwave) {
                Microwave mw = (Microwave) appliance;
                System.out.println(mw.getClass().getSimpleName());
                mw.performFunction();
            }
        }
    }
}
