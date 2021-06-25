package hr.fer.oop.petisamostalnio;

import java.util.*;

abstract class Game {    
    private String name;
    private int rating;

    protected Game(String name) {
        this.name = name;
    }    

    public String getName() {
        return name;
    }    

    public int getRating() {
        return rating;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }    
    
    @Override
    public String toString() {        
        return name + ":" + rating;
    }
}

abstract class Player {
    private String name;
    
    protected Player(String name) {
        this.name = name;        
    }    
    
    public String getName() {
        return name;
    }
    
    abstract void addGameScore(Game game, int score);
    
    abstract Iterable<Integer> getScores(Game game);
}

public class MyPlayer extends Player implements Iterable<Game> {
	
	private Map<Game,List<Integer>> scores = new TreeMap<>(Comparator.comparing(Game::getName));
	
    public MyPlayer(String name) {
        super(name);
    }
    
	@Override
	public Iterator<Game> iterator() {
		return scores.keySet().iterator();
	}
	
	@Override
	void addGameScore(Game game, int score) {
		scores.put(game, scores.getOrDefault(game, new LinkedList<>()));
        scores.get(game).add(score);
	}
	@Override
	
	Iterable<Integer> getScores(Game game) {
		return scores.get(game);
	}
}

class Factory {
	
	public static Game createGame(String name, int rating) {
		Game game = new Game(name) {};
        game.setRating(rating);
        return game;
	}
}
