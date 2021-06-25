package hr.fer.oop.devete;

import java.util.*;

public class LadderEnhancedByLossesOrder extends LadderEnhanced {
	
	public LadderEnhancedByLossesOrder(String...players) {
		super(players);
	}
	
	public Iterable<String> orderByLosses() {
		List<String> players = new LinkedList<>();
		Map<Integer, Set<String>> lossesMap = new TreeMap<>();
		
		for (String s: standings()) {
			int losses = losses(s);
			Set<String> set = lossesMap.get(losses);
			if (set == null) {
				set = new HashSet<>();
				lossesMap.put(losses, set);
			}
			set.add(s);
		}
		
		for (Set<String> set: lossesMap.values()) {
			players.addAll(set);
		}
		
		return players;
	}
}
