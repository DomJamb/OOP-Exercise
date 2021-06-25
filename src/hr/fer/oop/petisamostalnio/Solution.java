package hr.fer.oop.petisamostalnio;

import java.util.*;
import java.util.function.Predicate;

public class Solution {

//	public static Predicate<List<List<Integer>>> allDigitsMatch(double exemplar) {
//		
//		String exemplarString = Double.toString(exemplar);
//		
//		if (exemplarString.indexOf('.') != 1)
//            exemplarString = exemplarString.substring(exemplarString.indexOf('.') - 1);
//        final String s = exemplarString;
//        
//        return (list) -> {
//        	for (List<Integer> pair: list) {
//        		int index;
//                if(pair.get(0)==0) {
//                    index=0;
//                }else {
//                    index=pair.get(0)+1;
//                }
//                if(index<s.length())
//                    if(pair.get(1)!=(s.charAt(index)-'0'))
//                    return false;
//        	}
//        	return true;
//        };
//    }
	
	public static Predicate<List<List<Integer>>> allDigitsMatch(double exemplar) {
		
		String[] exString = Double.toString(exemplar).split("\\.");
		String newString = exString[0] + exString[1];
		
		return (list) -> {
			for (List<Integer> pair: list) {
				try {
					if (newString.charAt(pair.get(0)) - '0' != pair.get(1)) {
						return false;
					}
				} catch (StringIndexOutOfBoundsException e){
					continue;
				}
			}
			return true;
		};
	}
    
    public static Predicate<List<List<Integer>>> allDigitsDefined() {
    	
    	return (list) -> {
    		
            Set<Integer> indexSet = new TreeSet<>();
            for(List<Integer> pair:list) {
                indexSet.add(pair.get(0));
            }
            
//            int lastIndex=-1;
//            
//            for(int index:indexSet) {
//                if(lastIndex!=-1)
//                    if(index!=lastIndex+1)
//                        return false;
//                lastIndex=index;
//            }
            
            int previousIndex = -1;
            for(int index: indexSet) {
            	if (index - 1 != previousIndex) {
            		return false;
            	}
            	previousIndex = index;
            }
            
            return true;
        };
    }
}
