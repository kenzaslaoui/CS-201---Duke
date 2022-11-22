import java.util.*;

public class BigWord {
    public String most(String[] sentences) {
        HashMap<String, Integer> countingMap = new HashMap<String, Integer>();

        for(int j =0; j< sentences.length; j++){
            String[] strSingularWords = sentences[j].split("\\s");
            for(int i = 0; i < strSingularWords.length; i++){
                if(!countingMap.containsKey(strSingularWords[i].toLowerCase())){
                    countingMap.put(strSingularWords[i].toLowerCase() , 1);
                }
                else if(countingMap.containsKey(strSingularWords[i].toLowerCase())){
                    int n = countingMap.get(strSingularWords[i].toLowerCase());
                    countingMap.put(strSingularWords[i].toLowerCase(), n + 1);
                }
            }
        }

        String wordOfInterest = "";

        int max= -1;
        for(String word: countingMap.keySet()){
            int value = countingMap.get(word);
            if(value > max){
                wordOfInterest = word;
                max = value;
            }
        }
        return wordOfInterest;
    }
}