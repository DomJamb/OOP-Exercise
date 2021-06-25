package hr.fer.oop.devete;

import java.util.*;

public class PlayListUtil {
	
	public static Set<String> words(PlayList... playlists) {
		
		Set<String> set = new HashSet<>();
		
		for (PlayList playlist: playlists) {
			for (int i = 1; i <= playlist.count(); ++i) {
				String name = playlist.trackAt(i).getName();
				for (String s: name.split(" ")) {
					set.add(s);
				}
			}
		}
		
		return set;
	}
	
	public static Map<String, Integer> wordsOccurance(PlayList... playlists) {
		
		Map<String, Integer> map = new TreeMap<>();
		
		for (PlayList playlist: playlists) {
			for (int i = 1; i <= playlist.count(); ++i) {
				String name = playlist.trackAt(i).getName();
				for(String s : name.split(" "))  {
					Integer count = map.get(s);
					map.put(s, count == null ? 1 : count + 1);
				}
			}
		}
		
		return map;
	}
	
	public static Map<Integer, Map<String, Integer>> perLength(PlayList... playlists) {
		
		Map<Integer, Map<String, Integer>> map = new TreeMap<>();
		
		for (PlayList playlist: playlists) {
			for(int i=1, n = playlist.count() ; i <= n ; i++) {
				String name = playlist.trackAt(i).getName();
				for(String s : name.split(" "))  {
					Map<String, Integer> words = map.get(s.length());
					if (words == null) {
						words = new HashMap<>();
						map.put(s.length(), words);
					}
					Integer count = words.getOrDefault(s, 0);
					words.put(s, count + 1);
				}
			}
		}
		
		return map;
	}
}
