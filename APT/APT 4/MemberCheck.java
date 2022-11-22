import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, 
                                  String[] club2, 
                                  String[] club3) {
        
        List<String> club1List = new ArrayList<String>(Arrays.asList(club1));
        List<String> club2List = new ArrayList<String>(Arrays.asList(club2));
        List<String> club3List = new ArrayList<String>(Arrays.asList(club3));

        List<String> membersList = new ArrayList<String>();

        for(String element : club1List){
            if((club2List.contains(element) || club3List.contains(element)) & !membersList.contains(element)){
                membersList.add(element);
            }
        }

        for(String element : club2List){
            if(club3List.contains(element) & !membersList.contains(element)){
                membersList.add(element);
            }
        }
          
        int membersNumber = membersList.size();
        String[] membersArray = new String[membersNumber];

        int i = 0;
        for(String member : membersList){
            membersArray[i] = member;
            i += 1;
        }

        Arrays.sort(membersArray);

        return membersArray;
    }
 }