package hr.fer.oop.desete;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class CSVData {
	
	private List<CSVLine> lines = new ArrayList<>();
	private List<String> headers = new ArrayList<>();
	private boolean hasHeaders;
	
	public CSVData(boolean hasHeaders) {
		this.hasHeaders = hasHeaders;
	}
	
	public void addHeaders(Collection<String> headers) {
		this.headers.addAll(headers);
	}
	
	public List<String> getHeaders() {
		return this.headers;
	}
	
	public void addLine(CSVLine line) {
		lines.add(line);
	}
	
	public CSVLine getLine(int pos) {
		return lines.get(pos);
	}
	
	public boolean hasHeaders() {
		return this.hasHeaders;
	}
	
	public int numLines() {
		return this.lines.size();
	}
	
	public static CSVData loadCSVFile(String path, boolean hasHeaders) {
		
		CSVData data = new CSVData(hasHeaders);		
	
		try {
			boolean firstRow = true;
			List<String> list = new ArrayList<>();
			list = Files.readAllLines(Path.of(path));
			for (String line: list) {
				String[] words = line.split(",");
				String[] trimmedWords = new String[words.length];
				for (int i = 0; i < words.length; ++i) {
					trimmedWords[i] = words[i].trim();
				}
				List<String> allWords = new ArrayList<>(Arrays.asList(trimmedWords));
				CSVLine lajna = new CSVLine(allWords);
				if (hasHeaders && firstRow) {
					data.addHeaders(allWords);
					firstRow = false;
				} else {
					data.addLine(lajna);
				}
			}		
		} catch (IOException e) {
			
		}
		
		return data;
	}
}
