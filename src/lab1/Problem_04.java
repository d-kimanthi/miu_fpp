package lab1;


/*
Problem – 4 – Practice loops
a) Calculate the first N terms of the series: 1 – 1/3 + 1/5 – 1/7 + 1/9 -
…..
b) Calculate the first N terms of the series : 1/2 - 2/4 + 3/8 – 4/16 + 5/32 -
…..
 */
public class Problem_04 {
    public static void main(String[] args){

        for(int i = 0; i < 5; i++){
            System.out.printf("Series 1: Result for n = %d is %.2f\n",i,calculate01(i));

            System.out.printf("Series 2: Result for n = %d is %.2f\n",i,calculate02(i));
        }

    }

    public static double calculate01(int n){
        boolean isPlus = true;
        double answer = 0;
        double divider = 1;

        while(n > 0){

            answer = answer + (isPlus ? 1: -1) * (1/divider);
            isPlus = !isPlus;
            divider+=2;
            n--;
        }

        return answer;
    }

    public static double calculate02(int n) {
        boolean isPlus = true;
        double numerator = 1;
        double answer = 0;

        while (n > 0){
            answer = answer + (isPlus ? 1 : -1) * (numerator/Math.pow(2,numerator));
            numerator++;
            n--;
            isPlus = !isPlus;
        }

        return answer;

    }
}
