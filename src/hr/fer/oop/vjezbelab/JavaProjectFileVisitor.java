package hr.fer.oop.vjezbelab;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {
	
	Set<String> extensionFilter;
	Map<String, Long> projectFileSizeInfo = new HashMap<>();
	
	public JavaProjectFileVisitor(Set<String> extensionFilter) { 
		this.extensionFilter = extensionFilter;
	}
	
	public Map<String, Long> getProjectFileSizeInfo() {
		return projectFileSizeInfo;
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		
		int index = file.getFileName().toString().lastIndexOf(".");
		String ext = file.getFileName().toString().substring(index);
		
		if (extensionFilter.contains(ext)) {
        	return FileVisitResult.CONTINUE;
        }
		
		if (projectFileSizeInfo.containsKey(ext)) {
			Long cnt = projectFileSizeInfo.get(ext);
			cnt += Files.size(file);
			projectFileSizeInfo.put(ext, cnt);
		} else {
			projectFileSizeInfo.put(ext, Files.size(file));
		}
		
		return FileVisitResult.CONTINUE;
	}
}
