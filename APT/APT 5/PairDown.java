import java.util.*;

public class PairDown {
    public int[] fold(int[] list) {
        
        List<Integer> listOfSums = new ArrayList<>();
        
        for(int i = 0; i<list.length; i += 2){

            if(list.length == 1){
                listOfSums.add(list[i]);
                break;
            }

            if(i == list.length - 1 && list.length != 1){
                listOfSums.add(list[i]);
                break;
            }

            else {
                int sum = list[i] + list[i+1];
                listOfSums.add(sum);
            }
        }

        int[] sumArray = new int[listOfSums.size()];

        for(int j = 0; j < listOfSums.size(); j++){
            sumArray[j] = listOfSums.get(j);
        }

        return sumArray;
    }
}