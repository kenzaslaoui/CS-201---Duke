import java.util.*;

public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
        String returned = "";
        if(archive.length() == 0) return returned;
        String bits = String.valueOf(archive.charAt(0));
        List<String> dictList = new ArrayList<String>(Arrays.asList(dictionary));
        String[] aplphabetDict = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        int i = 1;
        while(i<= archive.length()){
            if(dictList.contains(bits)){
                int index = dictList.indexOf(bits);
                returned += aplphabetDict[index];
                bits = "";
            }
            if(i != archive.length()){
                bits += archive.charAt(i);
            }
            i++;
        }
        return returned;
    }
 }