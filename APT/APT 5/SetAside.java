import java.util.*;

public class SetAside {
    public String common(String[] list) {

        String result = "";
        List<String> words = new ArrayList<>();
        String[] firstStringWordsArray = list[0].split("\\s");
        List<String> firstStringWordsList = new ArrayList<String>();

        for(String word : firstStringWordsArray){
            if(!firstStringWordsList.contains(word)){
                firstStringWordsList.add(word);
            }
        }

        for(String word : firstStringWordsList){
            boolean inAllStrings = true;
            for(int i = 1; i<list.length; i++){
                String[] nextStringWordsArray = list[i].split("\\s");
                List<String> nextStringWordsList = new ArrayList<String>(Arrays.asList(nextStringWordsArray));
                if(!nextStringWordsList.contains(word)){
                    inAllStrings = false;
                    break;
                }
            }
            if(inAllStrings){
                words.add(word);
            }
        }

        Collections.sort(words);
        result = String.join(" ", words);

        return result;

    }
}