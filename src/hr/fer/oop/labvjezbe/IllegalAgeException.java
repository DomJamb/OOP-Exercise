package hr.fer.oop.labvjezbe;

public class IllegalAgeException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public IllegalAgeException(String poruka) {
		super(poruka);
	}
}
