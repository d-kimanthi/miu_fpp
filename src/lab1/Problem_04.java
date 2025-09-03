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

        System.out.println(calculate01(2));

    }

    public static double calculate01(int n){
        boolean isPlus = false;
        int answer = 1;
        int divider = 3;

        while(n > 1){
            answer = answer + (isPlus ? 1/divider : -(1/divider));
            isPlus = !isPlus;
            divider+=2;
            n--;
        }

        return answer;
    }
}
