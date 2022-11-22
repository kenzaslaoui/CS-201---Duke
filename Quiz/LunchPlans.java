import java.util.*;

public class LunchPlans {
    public String[] favorites(String[] preferences) {
        
        String[] firstPreferencesArray = preferences[0].split("\\s");
        List<String> firstPreferencesList = new ArrayList<String>(Arrays.asList(firstPreferencesArray));
        List<String> favoritesForAllList = new ArrayList<String>();

        for(String food : firstPreferencesList){
            boolean forAll = true;
            for(int i = 1; i<preferences.length; i++){
                String[] nextPreferencesArray = preferences[i].split("\\s");
                List<String> nextPreferencesList = new ArrayList<String>(Arrays.asList(nextPreferencesArray));
                if(!nextPreferencesList.contains(food)){
                    forAll = false;
                    break;
                }
            }
            if(forAll){
                favoritesForAllList.add(food);
            }
        }

        String[] favoritesForAll = new String[favoritesForAllList.size()];

        for(int i=0; i<favoritesForAllList.size(); i++){
            favoritesForAll[i] = favoritesForAllList.get(i);
        }

        return favoritesForAll;
    }
}
