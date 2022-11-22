import java.util.*;

public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        Map<Integer, String> strandsOfInterestMap = new TreeMap<>();
        HashSet<String> nucStrandsSet = new HashSet<>();
        String maxOccuranceStrand = new String();

        for(int i=0; i<strands.length; i++){
            if(strands[i].contains(nuc)){
                nucStrandsSet.add(strands[i]);
            }
        }

        if(nucStrandsSet.size()== 0){
            maxOccuranceStrand = "";
            return maxOccuranceStrand;
        }
        
        else{
            for(String strand : nucStrandsSet){
                int occurance = 1;
                for(int i = 0; i<strand.length(); i++){
                    if(strand.charAt(i) == nuc.charAt(0)){
                        occurance = occurance + 1;
                    }   
                }
                if(!strandsOfInterestMap.containsKey(occurance)){
                    strandsOfInterestMap.put(occurance, strand);
                }
                else if((strandsOfInterestMap.get(occurance)).length() <= strand.length()){
                    strandsOfInterestMap.put(occurance, strand);   
                }
            }
            maxOccuranceStrand = (strandsOfInterestMap).get(((TreeMap<Integer, String>) strandsOfInterestMap).lastKey());
        
        }    
    return maxOccuranceStrand;
    }
 }