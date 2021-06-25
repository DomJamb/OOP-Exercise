package hr.fer.oop.desete;

import java.util.*;

public class StandingsUtil {
	
	public static List<Pair<String, Integer>> orderByPoints(Map<String, Integer> map) {
		
		Map<Integer, Set<String>> perPoints = new TreeMap<>();
		
		for(var entry : map.entrySet()) {			
			Set<String> set = perPoints.get(entry.getValue());
			if (set == null) {
				set = new TreeSet<>();
				perPoints.put(entry.getValue(), set);
			}
			set.add(entry.getKey());
		}
		
		List<Pair<String, Integer>> list = new LinkedList<>();
		for(var entry : perPoints.entrySet()) {
			for(String country : entry.getValue()) {
				list.add(0, new Pair<>(country, entry.getKey()));
			}
		}
		
		return list;
	}	
}
