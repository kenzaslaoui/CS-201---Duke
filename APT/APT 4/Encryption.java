import java.util.*;

public class Encryption {
    public String encrypt(String message){
        HashMap<Character, String> encryptionMap = new HashMap<>();
        List<String> alphabetList = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
        char[] arrayMessage = message.toCharArray();
        String encryptedMessage = "";
        int i = 0;
        for(char character : arrayMessage){
            if(!encryptionMap.containsKey(character)){
                encryptionMap.put(character, alphabetList.get(i));
                i += 1;
            }
        }

        for(char character : arrayMessage){
            encryptedMessage += encryptionMap.get(character);
        }

        return encryptedMessage;
    }
}