import java.util.Arrays;

import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        List<String> dataList = new ArrayList<String>(Arrays.asList(data));
        Set<String> unique = new TreeSet<String>();
        for(String element : data){
            unique.add(element);
        }
        int[] frequencies = new int[unique.size()];

        int i = 0;
        for(String element : unique){
            frequencies[i] = Collections.frequency(dataList, element);
            i ++;
        }
        return frequencies;
    }
 }