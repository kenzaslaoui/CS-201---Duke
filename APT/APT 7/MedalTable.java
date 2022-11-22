import java.util.*;

public class MedalTable {
    public String[] generate(String[] results) {
        Map<String, List<Integer>> medalMap = new HashMap<String, List<Integer>>();

        for(String result : results){
            String goldCountry = result.substring(0, 3);
            String silverCountry = result.substring(4, 7);
            String bronzeCountry = result.substring(8);
        

            if(!medalMap.containsKey(goldCountry)){
                List<Integer> nullList = new ArrayList<Integer>(); 
                nullList.add(0); 
                nullList.add(0); 
                nullList.add(0);
                medalMap.put(goldCountry, nullList);
            }
            if(medalMap.containsKey(goldCountry)){
                List<Integer> goldValueList = medalMap.get(goldCountry);
                int numberOfGold = goldValueList.get(0) + 1;
                goldValueList.set(0, numberOfGold);
            }
            if(!medalMap.containsKey(silverCountry)){
                List<Integer> nullList = new ArrayList<Integer>(); 
                nullList.add(0); 
                nullList.add(0); 
                nullList.add(0);
                medalMap.put(silverCountry, nullList);
            }
            if(medalMap.containsKey(silverCountry)){
                List<Integer> silverValueList = medalMap.get(silverCountry);
                int numberOfSilver = silverValueList.get(1) + 1;
                silverValueList.set(1, numberOfSilver);
            }
            if(!medalMap.containsKey(bronzeCountry)){
                List<Integer> nullList = new ArrayList<Integer>(); 
                nullList.add(0); 
                nullList.add(0); 
                nullList.add(0);
                medalMap.put(bronzeCountry, nullList);
            }
            if(medalMap.containsKey(bronzeCountry)){
                List<Integer> bronzeValueList = medalMap.get(bronzeCountry);
                int numberOfBronze = bronzeValueList.get(2) + 1;
                bronzeValueList.set(2, numberOfBronze);
            }
        }

        String[] medalsByCountry = new String[medalMap.size()];
        int i = 0;
        for(String country : medalMap.keySet()){
            List<Integer> medalList = medalMap.get(country);
            medalsByCountry[i] = country + " " + medalList.get(0).toString() + " " + medalList.get(1).toString() + " " + medalList.get(2).toString();
            i++;
        }

        Comparator<String> comp1 = (a, b) -> Integer.parseInt(b.split(" ")[1]) - Integer.parseInt(a.split(" ")[1]);
        Comparator<String> comp2 = (a, b) -> Integer.parseInt(b.split(" ")[2]) - Integer.parseInt(a.split(" ")[2]);
        Comparator<String> comp3 = (a, b) -> Integer.parseInt(b.split(" ")[3]) - Integer.parseInt(a.split(" ")[3]);
        Arrays.sort(medalsByCountry, comp1.thenComparing(comp2).thenComparing(comp3).thenComparing(Comparator.naturalOrder()));
        return medalsByCountry;
    }
}