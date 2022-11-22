import java.util.*;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {

        ArrayList<String> newList = new ArrayList<String>();

        for(String word : list){
            int n = word.length();
            if(n >= minLength){
                if(!newList.contains(word)){
                    newList.add(word);
                }
            }
        }

        String[] wordsArray = new String[newList.size()];
        
        for(int i=0; i<newList.size(); i++){
            wordsArray[i] = newList.get(i);
        }

    return wordsArray;

    }    
}