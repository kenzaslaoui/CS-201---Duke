import java.util.*;

public class VoteRigging {
    public int minimumVotes(int[] votes) {
        if(votes.length == 1) {return 0;}
        
        int originalVote = votes[0];
        List<Integer> votesList = new ArrayList<Integer>();
        for(int i= 0; i<votes.length; i++){
            votesList.add(votes[i]);
        }
        
        int maxValue = Collections.max(votesList);

        if(votes[0] == maxValue && Collections.frequency(votesList, maxValue) == 1) {return 0;}

        while(votes[0] != maxValue || Collections.frequency(votesList, maxValue) != 1){
            int index = votesList.indexOf(maxValue);
            votes[0] += 1;
            votesList.set(0, votes[0]);
            if(index==0 && Collections.frequency(votesList, maxValue) == 1) {return votes[0] - originalVote;}
            if(index==0 && Collections.frequency(votesList, maxValue) != 1){
                for(int i = 1; i<votes.length; i++){
                    if(votes[i] == maxValue){
                        index = i;
                    }
                }
            }
            votes[index] -= 1; 
            votesList.set(index, votes[index]);
            maxValue = Collections.max(votesList);
        }
        return votes[0] - originalVote;
    }
 }


/*public class VoteRigging {
    public int minimumVotes(int[] votes) {
        List<Integer> votesList = new ArrayList<Integer>();
        for(int i= 0; i<votes.length; i++){
            votesList.add(votes[i]);
        }

        if(votes.length == 1){
            return 0;
        }
        int originalVote = votes[0];
        int maxValue = 0;
        int currentIndex = 1;
        int maxIndex = 0;
        while(currentIndex < votes.length){
            if(votes[maxIndex]>=votes[currentIndex]){
                if(currentIndex == votes.length -1){
                    maxValue = votes[maxIndex];
                }
                currentIndex +=1;
            }
            else{
                maxIndex = currentIndex;
                if(currentIndex == votes.length -1){
                    maxValue = votes[maxIndex];
                }
                currentIndex += 1;
            }
        }

        if(votes[0] == maxValue && Collections.frequency(votesList, maxValue) == 1){
            return 0;
        }

        while(votes[0] != maxValue || Collections.frequency(votesList, maxValue) != 1){
            int index = votesList.indexOf(maxValue);
            votes[0] += 1;
            votesList.set(0, votes[0]);
            votes[index] -= 1; 
            votesList.set(index, votes[index]);

            // Calculating the new maxValue
            currentIndex = 1;
            maxIndex = 0;
            while(currentIndex < votes.length){
                if(votes[maxIndex]>=votes[currentIndex]){
                    if(currentIndex == votes.length -1){
                        maxValue = votes[maxIndex];
                    }
                    currentIndex +=1;
                }
                else{
                    maxIndex = currentIndex;
                    if(currentIndex == votes.length -1){
                        maxValue = votes[maxIndex];
                    }
                    currentIndex += 1;
                }
            }
        }

        return votes[0]-originalVote;
    }
 }
 */