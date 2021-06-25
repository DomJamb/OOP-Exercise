package hr.fer.oop.vjezbelab;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class LogProcessor {
	
	private Path file;
	private List<LogEntry> logs;
	
	public LogProcessor(Path file) {
		this.file = file;
		logs = new ArrayList<>();
	}
	
	public void load() throws IOException {
		
		for (String line: Files.readAllLines(file)) {
			logs.add(parseLog(line));
		}
	}
	
	public List<LogEntry> getLogs() {
		return logs;
	}

	public static LogEntry parseLog(String line) {
		
		String[] splitLine = line.split("\s+");
		String[] splitText = line.split(" : ");
		
		return new LogEntry(splitLine[0] + " " + splitLine[1], splitLine[2], splitLine[7].substring(0, splitLine[7].length()-1), splitText[1]);
	}
}
