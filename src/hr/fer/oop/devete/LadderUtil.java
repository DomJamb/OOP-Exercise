package hr.fer.oop.devete;

import java.util.*;

public class LadderUtil {
	
	public static Iterable<Pair<String>> randomDraw(Ladder ladder) {
		
		List<Pair<String>> draw = new LinkedList<>();
		int count = ladder.count();
		List<String> lista = new ArrayList<>(count);
		
		for (String s: ladder.standings()) {
			lista.add(s);
		}
		
		Collections.shuffle(lista);
		
		for (int i = 0; i < lista.size() / 2; ++i) {
			draw.add(new Pair<String>(lista.get(i), lista.get(count - 1 - i)));
		}
		
		if (count % 2 == 1) {
			draw.add(new Pair<String>(lista.get(count / 2), "FREE"));
		}
		
		return draw;
	}
}
