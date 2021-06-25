package hr.fer.oop.devete;

import java.util.*;

public class Ladder {
	
	private List<String> players = new LinkedList<>();
	
	public Ladder(String... players) {
		join(players);
	}
	
	public void join(String... players) {
		for (String s: players) {
			if (!this.players.contains(s)) {
				this.players.add(s);
			}
		}
	}
	
	public void gameFinished(String winner, String loser) {
		
		int winnerPos = players.indexOf(winner);
		int loserPos = players.indexOf(loser);
		
		if (winnerPos < loserPos) {
			if (winnerPos != 0) {
				players.remove(winnerPos);
				players.add(winnerPos - 1, winner);
			}
		} else {
			int move = (winnerPos - loserPos) / 2;
			if (move != 0) {
				players.remove(winnerPos);
				players.add(winnerPos - move, winner);
			}
		}
		
		if (loserPos != players.size() - 1) {
			players.remove(loserPos);
			players.add(loserPos + 1, loser);
		}
	}
	
	public int count() {
		return this.players.size();
	}
	
	public Iterable<String> standings() {
		return Collections.unmodifiableList(players);
	}
}
