package hr.fer.oop.labvjezbe;

public class InvalidIPv6AddressException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public InvalidIPv6AddressException(String msg) {
		super(msg);
	}
}
