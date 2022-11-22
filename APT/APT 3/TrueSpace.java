public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long total = 0;
        for(int size : sizes){
            if(size%clusterSize == 0){
                total += clusterSize*(size/clusterSize);
            }
            else {
                total += clusterSize + clusterSize * (size/clusterSize);
            }
        }
    return total;
    }
}




































/* 
        int totalSize = 0;    
        Map<Integer, Integer> clusterSizeNeeded = new HashMap<>();
        for(int size : sizes){
            if(size == 0){
                clusterSizeNeeded.put(size, 0);
            }
            else if(clusterSize >= size){
                if(!clusterSizeNeeded.containsKey(size)){
                clusterSizeNeeded.put(size, clusterSize);
                }
                if(clusterSizeNeeded.containsKey(size)){
                    clusterSizeNeeded.put(size, clusterSizeNeeded.get(size)+clusterSize);
                }
            }
            else if(clusterSize < size){
                if(!clusterSizeNeeded.containsKey(size)){
                    if(size%clusterSize == 0){
                        int formula = clusterSize * (size/clusterSize);
                        clusterSizeNeeded.put(size, formula);
                    }
                    if(size%clusterSize != 0){
                        int formula = clusterSize + clusterSize * (size/clusterSize);
                        clusterSizeNeeded.put(size, formula);
                    }
                    
                }
                if(clusterSizeNeeded.containsKey(size)){
                    if(size%clusterSize == 0){
                        int formula = clusterSize * (size/clusterSize);
                        clusterSizeNeeded.put(size, clusterSizeNeeded.get(size)+formula);
                    }
                    if(size%clusterSize != 0){
                        int formula = clusterSize + clusterSize * (size/clusterSize);
                        clusterSizeNeeded.put(size, clusterSizeNeeded.get(size)+formula);
                    }
                }   
            }
        }

        for(Map.Entry<Integer, Integer> pair : clusterSizeNeeded.entrySet()) {       
            totalSize = totalSize + pair.getValue();
        }
        return Long.valueOf(totalSize);
    }
}
*/