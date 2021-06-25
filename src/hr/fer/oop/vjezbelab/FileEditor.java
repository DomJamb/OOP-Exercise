package hr.fer.oop.vjezbelab;

import java.io.IOException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class FileEditor {
	
	public static void processFile(Path inputFile, Path outputFile) throws IOException {
		
		List<String> linije = Files.readAllLines(inputFile, StandardCharsets.UTF_8);
		
		Writer writer = Files.newBufferedWriter(outputFile, StandardCharsets.UTF_8);
		
		for (String line: linije) {
			writer.write(line + "\n");
		}
		
		writer.close();
	}
}
