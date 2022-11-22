import java.util.*;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        List<String> availableList = new ArrayList<>(Arrays.asList(available));

        for(int i = 0; i < orders.length; i++){
            String[] sandwichIngredients = orders[i].split("\\s");
            boolean hasIngredient = true;

            for(String ingredient : sandwichIngredients){
                if(!availableList.contains(ingredient)){
                    hasIngredient = false;
                    break;
                }
            }
            if(hasIngredient){
                return i;
            } 
        }
        return -1;
    }
}
