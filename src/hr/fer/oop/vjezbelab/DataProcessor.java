package hr.fer.oop.vjezbelab;

class DataSource {
	
	public static Integer getNextNumber() {
		return null;
	}
	
	public static int size() {
		return -1;
	}
	
}

class DataProcessUtil {
	
	public static Integer processOneNumber(Integer number) {
		return null;
	}
	
	public static Integer handleException(Exception e, Integer number) {
		return null;
	}
	
}

public class DataProcessor {
	
	public static int process() {
		
		int umnozak = 1;
		Integer broj;
		Integer procesbroj = 0;
		
		for(int i = 0; i < DataSource.size(); ++i) {
			try {
				broj = DataSource.getNextNumber();
			} catch(Throwable t) { 
				continue;
			}
			try {
				procesbroj = DataProcessUtil.processOneNumber(broj);
			} catch (Exception e) {
				procesbroj = DataProcessUtil.handleException(e, procesbroj);
			}
			
			umnozak *= procesbroj.intValue();
			
		}
		
		return umnozak;
	}
}
