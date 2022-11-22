import java.util.*;

public class Starter {
    public int begins(String[] words, String first) {
        int nbElement = 0;

        for(int i = 0; i < words.length; i++){
            if(first.equals(words[i].charAt(0)+"")) {
                nbElement = nbElement + 1;
            }
        }
        
        String[] newArray = new String[nbElement];

        int j = 0;
        for(int i = 0; i < words.length; i++){
            if(first.equals(words[i].charAt(0)+"")) {
                newArray[j] = words[i];
                j = j + 1;
            }
        }

        HashSet<String> newset = new HashSet<>(Arrays.asList(newArray));

        return newset.size();
    }
}        
    
