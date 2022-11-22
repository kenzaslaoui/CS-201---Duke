import java.util.List;

import java.util.*;

public class Increasing {
    public int[] getIncreasing(int[] numbers) {
        List<Integer> increasingList = new ArrayList<Integer>();
        increasingList.add(numbers[0]);
        int previous = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > previous){
                increasingList.add(numbers[i]);
                previous = numbers[i];
            }
        }

        int listSize = increasingList.size();
        int[] increasingArray = new int[listSize];

        for(int i=0; i<increasingList.size(); i++){
            increasingArray[i] = increasingList.get(i);
        }

        return increasingArray;
    }
}