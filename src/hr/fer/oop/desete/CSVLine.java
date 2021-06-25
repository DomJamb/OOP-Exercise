package hr.fer.oop.desete;

import java.util.*;

public class CSVLine {
	
	private List<String> elements = new ArrayList<>();
	
	public CSVLine() {}
	
	public CSVLine(Collection<String> elements) {
		this.elements.addAll(elements);
	}
	
	public void appendElement(String element) {
		elements.add(element);
	}
	
	public String getElement(int pos) {
		return elements.get(pos);
	}
	
	public List<String> getElements() {
		return elements;
	}
	
	public int numElements() {
		return elements.size();
	}
}
