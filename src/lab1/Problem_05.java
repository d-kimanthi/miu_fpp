package lab1;

public class Problem_05 {
    public static void main(String[] args){

        int[] array = {0, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};

        secondMin(array);
    }

    public static void secondMin(int[] arrayOfInts){
        int firstMin = arrayOfInts[0];
        int secondMin = arrayOfInts[0];
        for(int v: arrayOfInts){
            firstMin = Math.min(firstMin, v);
            if(firstMin == secondMin){
                secondMin = v;
            }
            else if(v != firstMin){
                secondMin = Math.min(secondMin, v);
            }
        }
        System.out.printf("Second min element is: %d", secondMin);
    }
}
