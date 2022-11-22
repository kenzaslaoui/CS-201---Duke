import java.util.*;

public class SimpleWordGame {
    public int points(String[] player, 
                      String[] dictionary) {
        
    int totalScore = 0;    
    Map<String, Integer> playerScoreMap = new HashMap<>();                     
    List<String> dictionaryList = new ArrayList<>(Arrays.asList(dictionary));
    HashSet<String> playerSet = new HashSet<>(Arrays.asList(player));

    for(String word : playerSet){
        if(dictionaryList.contains(word)){
            playerScoreMap.put(word, word.length()*word.length());
        }
    } 
    for(Map.Entry<String, Integer> pair : playerScoreMap.entrySet()) {       
        totalScore = totalScore + pair.getValue();
    }
        return totalScore;
    }
}