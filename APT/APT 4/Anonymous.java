import java.util.*;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        int nMessages = 0;
        String oneBigHeadline = "";

        for(String headline : headlines){
            oneBigHeadline = oneBigHeadline + headline;
        }

        char[] allCharInHeadlines = (oneBigHeadline.toLowerCase()).toCharArray();
        List<Character> allCharHeadlinesList = new ArrayList<> ();

        for(int j=0; j < allCharInHeadlines.length; j++){
            allCharHeadlinesList.add(allCharInHeadlines[j]);
        }

        for(String message : messages){
            if(message.trim().length() == 0){ 
                nMessages += 1;
            }

            else {
                HashSet<Character> messageLetterSet = new HashSet<Character>();
                char[] allCharInMessage = ((message.replaceAll("\\s+","")).toLowerCase()).toCharArray();
                List<Character> listCharMessage = new ArrayList<> ();
                boolean hasAllChar = true;

                for(char character : allCharInMessage){
                        messageLetterSet.add(character);
                }

                for(int j=0; j<allCharInMessage.length; j++){
                    listCharMessage.add(allCharInMessage[j]);
                }

                for(char letter : messageLetterSet){
                    if (Collections.frequency(allCharHeadlinesList, letter) < Collections.frequency(listCharMessage, letter)){
                        hasAllChar = false;
                        break;
                    }
                }

                if(hasAllChar){
                    nMessages += 1;
                }
            }                
        }

        return nMessages;
    }
}