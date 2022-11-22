import java.util.*;

public class FriendScore {
    public int highestScore(String[] friends) {
       HashSet<Integer> scores = new HashSet<>();
       for(int i=0; i<friends.length; i++){
            int personScore = 0;
            Set<Integer> visited = new HashSet<>();
            for(int j = 0; j<friends[i].length(); j++){
                if(friends[i].charAt(j) == 'Y'){
                    if(!visited.contains(j)){
                        personScore +=1;
                    }
                    visited.add(j);
                    for(int k = 0; k < friends[j].length(); k++){								
                        if(friends[j].charAt(k) == 'Y' && k!=i){
                            if(!visited.contains(k)){
                                personScore +=1;
                            }
                            visited.add(k);
                        }						
                    }
                }
            } 
            scores.add(personScore);   
        }
        return Collections.max(scores);
    }
}

/*public class FriendScore {
    public int highestScore(String[] friends) {
       HashMap<Integer, Integer> scores = new HashMap<>();
       for(int i=0; i<friends.length; i++){
            int person = i;
            scores.putIfAbsent(person, 0);
            String personFriends = friends[i];
            for(int j = 0; j<personFriends.length(); j++){
                if(personFriends.charAt(j) == 'Y'){
                    scores.put(person, scores.get(person) + 1);
                    for(int k = 0; k < friends[j].length(); k++){								
                        if(friends[j].charAt(k) == 'Y' && k!=i){
                            scores.put(person, scores.get(person) + 1);
                        }						
                    }
                }
            }    
        }
        Set<Integer> scoresSet = new HashSet<>();
        for(int score : scores.keySet()){
            scoresSet.add(scores.get(score));
        }
        return Collections.max(scoresSet);
    }
 }*/

 /*public class FriendScore {
    public int highestScore(String[] friends) {
       HashMap<Integer, Integer> scores = new HashMap<>();
       for(int i=0; i<friends.length; i++){
            int person = i;
            scores.putIfAbsent(person, 0);
            String personFriends = friends[i];
            for(int j = 0; j<personFriends.length(); j++){
                if(personFriends.charAt(j) == 'Y'){
                    scores.put(person, scores.get(person) + 1);
                    scores.putIfAbsent(j, 0);
                    scores.put(j, scores.get(j) + 1);
                }
                if(personFriends.charAt(j) == 'N'){
                    scores.putIfAbsent(j, 0);
                }
            }
        }
        Set<Integer> scoresSet = new HashSet<>();
        for(int score : scores.keySet()){
            scoresSet.add(scores.get(score));
        }

       return Collections.max(scoresSet);
    }
 } */
