package hr.fer.oop.devete;

import java.util.*;
import java.util.OptionalInt;

public class PlayList {
	
	private String name;
	private final OptionalInt limit;
	private final List<Track> tracks = new ArrayList<>();
	private int duration = 0;
	
	public PlayList(String name) {
		this.setName(name);
		this.limit = OptionalInt.empty();
	}
	
	public PlayList(String name, int durationLimit) {
		this.setName(name);
		this.limit = OptionalInt.of(durationLimit);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int count() {
		return tracks.size();
	}
	
	public int duration() {
		return duration;
	}
	
	public Track trackAt(int i) {
		return tracks.get(i-1);
	}
	
	public void move(int position, int move) {
		Track t = tracks.remove(position - 1);
		tracks.add(position + move - 1, t);
	}
	
	public void deleteAt(int position) {		
		Track t = tracks.remove(position - 1);
		duration -= t.getDuration();
	}
	
	public boolean add(Track track) {
		if (limit.isPresent()) {
			if (track.getDuration() + duration > limit.getAsInt()) {
				return false;
			}
		}
		
		tracks.add(track);
		duration += track.getDuration();
		return true;
	}
	
	public void invert() {
		int n = tracks.size();
		for (int i = 0; i < n / 2; ++i) {
			Track temp = tracks.get(i);
			tracks.set(i, tracks.get(n - 1 - i));
			tracks.set(n - 1 - i, temp);
		}
	}
}
