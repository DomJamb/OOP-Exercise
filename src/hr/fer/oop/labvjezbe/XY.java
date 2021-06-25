package hr.fer.oop.labvjezbe;

public class XY extends SingleTypeKeyValue<Double>{
	
	public XY(double key, double value) {
        super(key, value);
    }
	
	public static boolean isIncreasingFunction(XY[] data) {
		
		if (data == null || data.length == 1) {
			return true;
		}
		
		XY[] change = new XY[data.length];
        for (int i = 0; i < data.length; i++) {
            change[i] = data[i];
        }
        
        for (int i = 0; i < change.length; i++) {
            for (int j = i; j < change.length; j++) {
                if (change[i].getKey().doubleValue() > change[j].getKey().doubleValue()) {
                    XY pomocni = change[j];
                    change[j] = change[i];
                    change[i] = pomocni;
                }
            }
        }
        
        for (int i = 0; i < change.length - 1; ++i) {
        	
        	if (change[i].getValue().doubleValue() > change[i+1].getValue().doubleValue()) {
        		return false;
        	}
        }
        
        return true;
	}
}
