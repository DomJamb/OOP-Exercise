package hr.fer.oop.vjezbelab;

import java.util.*;

public class LabTask {
	
	 public static Map<Integer, Set<String>> underpayed(Map<String, Map<Integer, List<Integer>>> salaries) {
		 
		 Map<Integer, Set<String>> mapa = new HashMap<>();
		 Map<Integer, Map<String, Integer>> pomocna = new HashMap<>();
		 
		 for(var worker: salaries.keySet()) {
			 for(var year: salaries.get(worker).keySet()) {
				 int sum = 0;
				 for (Integer salary: salaries.get(worker).get(year)) {
					 sum += salary;
				 }
				 Map<String, Integer> map = new HashMap<>();
				 map.put(worker, sum / 12);
				 if (pomocna.containsKey(year)) {
					 map.putAll(pomocna.get(year));
				 }
				 pomocna.put(year, map);
			 }
		 }
		 
		 for(var year: pomocna.keySet()) {
			 int yearlyavg = 0;
			 for(var entry: pomocna.get(year).entrySet()) {
				 yearlyavg += entry.getValue();
			 }
			 double avg = yearlyavg / pomocna.get(year).size();
			 for(var entry: pomocna.get(year).entrySet()) {
				 if (entry.getValue() <= 0.7 * avg) {
					 Set<String> set = new TreeSet<>();
					 set.add(entry.getKey());
					 if (mapa.containsKey(year)) {
						 set.addAll(mapa.get(year));
					 }
					 mapa.put(year, set);
				 }			 
			 }
		 }
		 
		 return mapa;
	 }
	 
	 public static int count(Map<Integer, Integer> map, Set<Integer> set) {
		 
		 int count = 0;
		 
		 Set<Integer> newSet = new HashSet<>(set);
		 
		 for (Integer value: map.values()) {
			 if (newSet.contains(value)) {
				 count++;
				 newSet.remove(value);
			 }
		 }
		 
		 return count;
	 }
}
