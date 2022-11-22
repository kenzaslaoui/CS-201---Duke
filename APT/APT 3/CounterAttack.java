import java.util.*;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        String[] strSingularWords = str.split("\\s"); 

        HashMap<String, Integer> countingMap = new HashMap<String, Integer>();

        for(int j =0; j< words.length; j++){
            countingMap.put(words[j],0);
            for(int i =0; i< strSingularWords.length; i++){
                if(strSingularWords[i].equals(words[j])){
                    int n = countingMap.get(words[j]);
                    countingMap.put(words[j], n + 1);
                }
            }
        } 
        
        int[] occurences = new int[countingMap.size()];

        int i = 0;
        for(String word : words){
            occurences[i] = countingMap.get(word);
            i+= 1;
        }

        return occurences;
    }
}