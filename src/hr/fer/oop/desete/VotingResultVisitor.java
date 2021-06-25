package hr.fer.oop.desete;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;

public class VotingResultVisitor extends SimpleFileVisitor<Path>  {
	
	private Map<String, Integer> standings = new HashMap<>();
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		
		String filename = file.getFileName().toString();
		
		if (filename.endsWith("-jury.txt") || filename.endsWith("-televoting.txt")) {
			PointsUtil.updateStandings(file, standings);
		}
		
		return FileVisitResult.CONTINUE;		
	}
	
	public Map<String, Integer> standings() {
		
		return standings;
	}
}
