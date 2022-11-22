import java.util.*;

public class Closet {
    public String anywhere(String[] list) {
        String result = "";
        List<String> words = new ArrayList<>();

        for(int i = 0; i<list.length; i++){
            String[] StringWordsArray = list[i].split("\\s");
            List<String> StringWordsList = new ArrayList<String>(Arrays.asList(StringWordsArray));

            for(String word : StringWordsList){
                if(!words.contains(word)){
                    words.add(word);
                }
            }
        }

        Collections.sort(words);
        result = String.join(" ", words);

        return result;
    }
}


    

   
