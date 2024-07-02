package Day_02_Review;

import com.sun.jdi.Value;

public class TwoSum {

    public static void main(String[] args) {

        int[] array = new int[]{2,7,9,11};
    }

    public static int[] twoSumSolution(int[] array, int targetValue){

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (i!=j){
                if (array[i] + array[j] == targetValue)
                    return new int[]{i,j};

            }}
        }

        return new int[]{};
    }
}


