package lab1;

import java.util.Arrays;

public class Problem_03 {
    public static void main(String[] args){
        String[] array = {"horse", "dog", "cat", "horse", "dog"};
        String[] answer = new String[array.length];

        int dcount = 0;
        for(String word: array){
            boolean isDuplicated = false;
            for(String ans: answer){
                if (word.equals(ans)) {
                    isDuplicated = true;
                    break;
                }
            }
            if(!isDuplicated){
                answer[dcount] = word;
                dcount++;
            }
        }

        answer = Arrays.copyOf(answer,dcount);

        System.out.println(Arrays.toString(answer));
    }
}
