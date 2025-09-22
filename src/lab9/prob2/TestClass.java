package lab9.prob2;

public class TestClass {
    public static void main(String[] args) {
        CustomerAccount ca1 = new CustomerAccount("cusName-1", "accNo-1",200);

        // Invalid requests
        // invalid $0 deposit
        try {
            ca1.deposit(0);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        // invalid minus $-10 deposit
        try {
            ca1.deposit(-10);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        // invalid minus $-10 withdraw
        try {
            ca1.withdraw(-10);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        // invalid account limit exceeded withdraw
        try {
            ca1.withdraw(2000);
        }catch (AccountException e){
            System.out.println(e.getMessage());
        }
        // invalid withdraw account cannot be below $100
        try {
            ca1.withdraw(100);
        }catch (AccountException e){
            System.out.println(e.getMessage());
        }

        // Valid requests
        ca1.deposit(10);
        ca1.withdraw(100);

    }
}
