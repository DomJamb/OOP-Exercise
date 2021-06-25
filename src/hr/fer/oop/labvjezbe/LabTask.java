package hr.fer.oop.labvjezbe;

import java.util.*;

public class LabTask {
	
	public static List<Integer> viceversa(Map<Integer, Integer> map) {
		 
		 List<Integer> list = new ArrayList<>();
		 Set<Integer> helpSet = new TreeSet<>();
		 
		 for (var key: map.keySet()) {
			 for (var value: map.values()) {
				 if ((map.get(key) == value) && (map.get(value) == key)) {
					 helpSet.add(key);
				 }
			 }
		 }
		 
		 list.addAll(helpSet);
		 Collections.reverse(list);
		 return list;
	 }
}
