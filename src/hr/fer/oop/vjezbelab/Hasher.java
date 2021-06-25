package hr.fer.oop.vjezbelab;

public interface Hasher {
	
	public byte[] hash(byte[] prevHash, String[] transactions);
}
