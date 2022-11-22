import java.util.*;

public class Translate {
    public int numAlternates(String original, String translated) {
        int alternateNumber = 0;
        String[] originalArray = original.split("\\s");
        String[] translatedArray = translated.split("\\s");
        Map<String, Set<String>> translationsMap = new HashMap<String, Set<String>>();

        for(int i = 0; i < originalArray.length; i++){
            if(translationsMap.containsKey(originalArray[i])){
                translationsMap.get(originalArray[i]).add(translatedArray[i]);
            }
            else if (!translationsMap.containsKey(originalArray[i])){
                Set<String> newSet = new HashSet<String>();
                newSet.add(translatedArray[i]);
                translationsMap.put(originalArray[i], newSet);
            } 
        }

        for(String translationSet : translationsMap.keySet()){
            Set<String> valueSet = new HashSet<String>();
            valueSet = translationsMap.get(translationSet);
            if(valueSet.size() > 1){
                alternateNumber += valueSet.size();
            }
        }

        return alternateNumber;
    }
}