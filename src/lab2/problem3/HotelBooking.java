package lab2.problem3;

public record HotelBooking(String hotelName, int nights, float pricePerNight) {
    public  HotelBooking{
        if(hotelName == null || hotelName.isEmpty() || nights <= 0 || pricePerNight <= 0.0){
            throw new IllegalArgumentException("Invalid input");
        }
    }

    public double totalCost(){
        return nights * pricePerNight;
    }
}
