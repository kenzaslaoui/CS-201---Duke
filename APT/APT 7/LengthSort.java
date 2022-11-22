import java.util.*;

public class LengthSort {
    public String[] rearrange(String[] values){
        Map<Integer, List<String>> lengthsMap = new TreeMap<Integer, List<String>>();
        for(String element : values){
            int length = element.length();
            if(lengthsMap.containsKey(length)){
                lengthsMap.get(length).add(element);
            }
            else{
                lengthsMap.put(length, new ArrayList<String>());
                lengthsMap.get(length).add(element);
            }
        }

        int i = 0;
        for(int length : lengthsMap.keySet()){
            List<String> sameLengthWords = lengthsMap.get(length);
            Collections.sort(sameLengthWords);
            for(String word : sameLengthWords){
                values[i] = word;
                i ++;
            }
        }

        return values;
    }
}