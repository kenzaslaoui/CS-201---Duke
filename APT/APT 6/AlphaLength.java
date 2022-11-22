import java.util.*;

public class AlphaLength {
    public ListNode create (String[] words) {
        int n = words.length;
        List<String> wordsList = new ArrayList<String>();
        Arrays.sort(words);

        for(int i=0; i<n; i++){
            if(!wordsList.contains(words[i])){
                wordsList.add(words[i]);
            }
        }

        ListNode current = new ListNode((wordsList.get(0)).length());
        ListNode list = new ListNode((wordsList.get(0)).length());
        list = current;


        for(int i=0; i<wordsList.size(); i++){
            ListNode next = new ListNode(0);

            if(i == 0 && i != wordsList.size()-1){
                list.info = (wordsList.get(i)).length();
                list.next = next;
                current = next;
            }
            if(i == wordsList.size()-1){
                current.info = (wordsList.get(i)).length();
                current.next = null;
            }
            else if (i != 0 && i != wordsList.size()-1){
                current.info = (wordsList.get(i)).length();
                current.next = next;
                current = next;
            }
        }

    return list;
    }
}
