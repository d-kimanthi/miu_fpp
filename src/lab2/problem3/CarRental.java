package lab2.problem3;

public final class CarRental {
    private final String carModel;
    private final int days;
    private final float ratePerDay;
    private final float milesPerDay;

    public CarRental(String carModel, int days, float ratePerDay, float milesPerDay){
        this.carModel = carModel;
        this.days = days;
        this.ratePerDay = ratePerDay;
        this.milesPerDay = milesPerDay;
    }

    public double totalRentalCost(){
        return this.days * this.ratePerDay;
    }

    public double totalMilesAllowed(){
        return this.days * this.milesPerDay;
    }
}
