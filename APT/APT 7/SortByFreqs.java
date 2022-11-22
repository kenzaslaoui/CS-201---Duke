import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {
        List<String> dataList = new ArrayList<String>(Arrays.asList(data));
        Comparator<String> comp = (a,b) -> (Collections.frequency(dataList, b) - Collections.frequency(dataList, a));
        Arrays.sort(data, comp.thenComparing(Comparator.naturalOrder()));
        List<String> dataListSorted = new ArrayList<String>(Arrays.asList(data));
        List<String> sortedList = new ArrayList<String>();

        for(String element : dataListSorted){
            if(!sortedList.contains(element)){
                sortedList.add(element);
            }
        }

        String[] sorted = new String[sortedList.size()];

        for(int i = 0; i<sortedList.size() ; i++){
            sorted[i] = sortedList.get(i);
        }

        return sorted;
    }
}
