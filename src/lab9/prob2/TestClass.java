package lab9.prob2;

public class TestClass {
    public static void main(String[] args) {
        CustomerAccount ca1 = new CustomerAccount("cusName-1", "accNo-1",200);

        // Invalid requests
        //ca1.deposit(0);
        //ca1.deposit(-10);
        //ca1.withdraw(-10);
        //ca1.withdraw(2000);
        //ca1.withdraw(100);

        // Valid requests
        ca1.deposit(10);
        ca1.withdraw(100);

    }
}
