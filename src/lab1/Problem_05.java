package lab1;

/*
    authors: @Jephthah David,  @Temuujin Bat-Amgalan
    since: 2025-09-02
 */
public class Problem_05 {
    public static void main(String[] args){

        int[] array = {-10, 21, 3, 45, 12, 18, 6, 3, 0, 5, 0};

        secondMin(array);
    }

    public static void secondMin(int[] arrayOfInts){
        int firstMin = arrayOfInts[0];
        int secondMin = arrayOfInts[0];
        for(int v: arrayOfInts){
            firstMin = Math.min(firstMin, v);
        }
        for(int v: arrayOfInts){
            if(firstMin == secondMin){
                secondMin = v;
            }else if(firstMin != v){
                secondMin = Math.min(secondMin, v);
            }
        }
        System.out.printf("Second min element is: %d", secondMin);
    }
}
