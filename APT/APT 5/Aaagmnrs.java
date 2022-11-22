import java.util.*;

public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
        List<String> strings = new ArrayList<>();

        for(int i = 0; i < phrases.length; i++){
            String phrase = (phrases[i].toLowerCase()).replaceAll("\\s+","");
            char[] phraseArray = phrase.toCharArray();
            Arrays.sort(phraseArray);
            String modifiedPhrase = new String(phraseArray);
            
            boolean notInList = true;
            
            for(String word : strings){
                String word1 = (word.toLowerCase()).replaceAll("\\s+","");
                char[] wordArray = word1.toCharArray();
                Arrays.sort(wordArray);
                String modifiedWord = new String(wordArray);

                if(modifiedWord.equals(modifiedPhrase)){
                    notInList = false;
                    break;
                }
            }

            if(notInList){
                strings.add(phrases[i]);
            }
        }


        String[] stringsArray = new String[strings.size()];
        
        for(int j = 0; j < strings.size(); j++){
            stringsArray[j] = strings.get(j);
        }

        return stringsArray;
    }
 }
