package hr.fer.oop.vjezbelab;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class JavaProjectFileVisitor1 extends SimpleFileVisitor<Path> {
	
	Set<String> extensionFilter;
	Map<String, Set<Path>> data = new LinkedHashMap<>();
	
	public JavaProjectFileVisitor1(Set<String> extensionFilter) { 
		this.extensionFilter = extensionFilter;
	}
	
	public Map<String, Set<Path>> getProjectPathsPerExtension() {
		
		return data;
	}
	
	@Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		
		int index = file.getFileName().toString().lastIndexOf('.');
		String extension = file.getFileName().toString().substring(index);
		
		if (extensionFilter.contains(extension)) {
        	return FileVisitResult.CONTINUE;
        }
		
		if(Objects.isNull(data.get(extension))) {
			data.put(extension, new LinkedHashSet<>());
		}
		
		Set<Path> pathData = data.get(extension);
        pathData.add(file);
        data.put(extension, pathData);
		
		return FileVisitResult.CONTINUE;
	}
}
