package lab2;

public class TestCustomer {
    public static void main(String[] args){
        Customer c1 = new Customer("John", "Onko", "12345");
        Customer c2 = new Customer("Jephthah", "David", "54321");
        Customer c3 = new Customer("Temuujin", "Bat-Amgalan", "123344");

        Address c1Address = new Address("street1", "Fairfield", "Iowa", "55225");
        c1.setBillingAddress(c1Address);
        c1.setShippingAddress(c1Address);

        Address c2Address = new Address("street2", "Chicago", "Illinois", "175834");
        c2.setBillingAddress(c2Address);
        c2.setShippingAddress(c2Address);

        Address c3Address = new Address("street3", "San Francisco", "California", "845123");
        c3.setBillingAddress(c3Address);
        c3.setShippingAddress(c3Address);

        Customer[] customers = {c1,c2,c3};



        for(Customer c : customers){
            if(c.getBillingAddress().getCity().equalsIgnoreCase("chicago")) System.out.println("Customer who lives in Chicago: " + c);
        }
    }
}
