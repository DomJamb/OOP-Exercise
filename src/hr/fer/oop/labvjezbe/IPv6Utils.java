package hr.fer.oop.labvjezbe;

public class IPv6Utils {
	
	public static void checkIPv6AddressValidity(String ip) throws InvalidIPv6AddressException {
		
		String[] ipField = ip.split(":");
		
		if (ipField.length != 8) {
			throw new InvalidIPv6AddressException("IPv6 address does not contain 8 hexadecimal numbers!");
		}
		
		for (String ipPart: ipField) {
			
			String check = ipPart;
			check = check.toUpperCase();
			
			for (int i = 0; i < check.length(); ++i) {
				char ch = check.charAt(i);
				
				if((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F')) {
					throw new InvalidIPv6AddressException("One or more strings in the IPv6 address are not hexadecimal numbers!");
				}
			}
		}
		
		for (String ipPart: ipField) {
			
			String check = ipPart;
			if (check.length() >  4) {
				throw new InvalidIPv6AddressException("One or more numbers in the IPv6 address are not in the correct range!");
			}
		}
	}
}
