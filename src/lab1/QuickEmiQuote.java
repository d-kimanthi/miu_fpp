package lab1;

import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class QuickEmiQuote {
    public static void main(String[] args) {
        Random rm = new Random();
        /* Step1: Randomize inputs */
        int principal = (int) Math.floor(Math.random() * (25000 - 5000 + 1)) + 5000;
        int tenureInMonths = rm.nextInt(6,37);
        float annualInterestRate = rm.nextFloat(3.5F,11.6F);

        // Step 2: Compute EMI
        float monthlyInterestRate = (annualInterestRate/12)/100;
        double EMI = (principal * monthlyInterestRate * Math.pow((1+monthlyInterestRate),tenureInMonths))/((Math.pow((1+monthlyInterestRate),tenureInMonths))-1);

        double totalPayment = (EMI * tenureInMonths);

        double totalInterest = (totalPayment - principal);

        //Step 3: Multiple integer views
        int intEMI = (int)EMI;
        int emiRounded = (int)Math.round(EMI);

        // Step 4: Format output

        System.out.printf("Principal amount: %.2f\n",(float)principal);
        System.out.printf("Tenure in months: %d\n",tenureInMonths);
        System.out.printf("Annual interest rate: %.2f\n",annualInterestRate);
        System.out.printf("Monthly interest rate: %.2f\n",monthlyInterestRate);
        System.out.printf("EMI amount: %.2f\n",EMI);
        System.out.printf("Total payment amount: %.2f\n",totalPayment);
        System.out.printf("Total interest: %.2f\n",totalInterest);
        System.out.printf("EMI amount as Int: %d\n",intEMI);
        System.out.printf("EMI amount rounded: %d",emiRounded);
    }
}
