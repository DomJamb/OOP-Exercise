package hr.fer.oop.desete;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;

public class VotingFilter implements DirectoryStream.Filter<Path>{
	
	@Override
	public boolean accept(Path entry) throws IOException {
		String filename = entry.getFileName().toString();
		return filename.endsWith("-jury.txt") || filename.endsWith("-televoting.txt");
	}
}
