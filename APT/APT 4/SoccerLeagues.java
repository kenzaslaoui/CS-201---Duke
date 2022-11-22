import java.util.*;

public class SoccerLeagues {
    public int[] points(String[] matches) {
        HashMap<Integer,Integer> scores = new HashMap<>();

        for(int i=0; i<matches.length; i++){
            int team = i;
            scores.putIfAbsent(team, 0);
            String homeScore = matches[i];
            for(int j = 0; j<homeScore.length(); j++){
                if(homeScore.charAt(j) == 'W'){
                    scores.put(team, scores.get(team) + 3);
                }
                if(homeScore.charAt(j) == 'D'){
                    scores.put(team, scores.get(team) + 1);
                    scores.putIfAbsent(j, 0);
                    scores.put(j, scores.get(j) + 1);
                }
                if(homeScore.charAt(j) == 'L'){
                    scores.putIfAbsent(j, 0);
                    scores.put(j, scores.get(j) + 3);
                }
            }
        }

        int[] scoresArray = new int[scores.size()];

        int i = 0;
        for(int score : scores.keySet()){
            scoresArray[i] = scores.get(score);
            i ++;
        }

        return scoresArray;
    }
}