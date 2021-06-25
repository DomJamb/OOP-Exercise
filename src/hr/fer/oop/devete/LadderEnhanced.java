package hr.fer.oop.devete;

import java.util.*;

public class LadderEnhanced extends Ladder {
	
	private Map<String, PlayerInfo> statistics = new HashMap<>();
	
	public LadderEnhanced(String... players) {
		super(players);
	}
	
	@Override
	public void gameFinished(String winner, String looser) {
		PlayerInfo info = statistics.get(winner);
		if (info == null) {
			info = new PlayerInfo();
			statistics.put(winner, info);
		}
		info.setWins(info.getWins() + 1);
		
		info = statistics.get(looser);
		if (info == null) {
			info = new PlayerInfo();
			statistics.put(looser, info);
		}
		info.setLosses(info.getLosses() + 1);
		
		super.gameFinished(winner, looser);
	}
	
	public int wins(String player) {
		PlayerInfo info = statistics.get(player);
		if (info == null) {
			return 0;
		} else {
			return info.getWins();
		}
	}
	
	public int losses(String player) {
		PlayerInfo info = statistics.get(player);
		if (info == null) {
			return 0;
		} else {
			return info.getLosses();
		}
	}
}
