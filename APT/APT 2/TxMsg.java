import java.util.*;

public class TxMsg {
    public String getMessage(String original) {
        String[] originalSingularWords = original.split("\\s");
        String abbreviation = "";
        HashSet<Character> vowelSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for(int j =0; j< originalSingularWords.length; j++){
            boolean allVowels = true;
            for(int i =0; i<originalSingularWords[j].length(); i++){
                if(!vowelSet.contains(originalSingularWords[j].charAt(i))){
                    allVowels = false;
                    break;
                }
            }
            if(allVowels){
                abbreviation = abbreviation + originalSingularWords[j];
            }

            for(int i =0; i<originalSingularWords[j].length(); i++){
                if(i==0 && !vowelSet.contains(originalSingularWords[j].charAt(i))){
                    abbreviation = abbreviation + originalSingularWords[j].charAt(i);
                }

                if(i>=1){
                    if(!vowelSet.contains(originalSingularWords[j].charAt(i)) && vowelSet.contains(originalSingularWords[j].charAt(i - 1))){
                        abbreviation = abbreviation + originalSingularWords[j].charAt(i);
                    }
                }
            }

            if(j != originalSingularWords.length - 1){
                abbreviation = abbreviation + " ";   
            }
            
        }
    return abbreviation;
    }       
}
    
