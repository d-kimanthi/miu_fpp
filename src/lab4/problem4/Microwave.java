package lab4.problem4;

public class Microwave {
    private int powerLevel;

    public Microwave(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String heatFood() {
        return "Heating food at power level: " + powerLevel + ".";
    }
    public void performFunction() {
        System.out.println("Heating food at power level: " + powerLevel + ".");
    }
}
