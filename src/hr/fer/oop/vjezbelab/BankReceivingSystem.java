package hr.fer.oop.vjezbelab;
	
	class BankReceivingSystem implements ReceivingSystem {
		
		private int urgentCustomer;
		private int notUrgentCustomer;
		private int total;
		private boolean isWorkerOccupied;
		
		public BankReceivingSystem() {
			isWorkerOccupied = false;
			urgentCustomer = 0;
			notUrgentCustomer = 0;
			total = 0;
		}
		
		public void customerArrived(boolean urgent) {
			
			if (urgent) {
				++urgentCustomer;
			} else {
				++notUrgentCustomer;
			}
			
			++total;
			
			calculateEmployeeStatus();
		}
		
	    public void customerLeft(boolean urgent) {	    	
	    	
	    	if (urgent) {	    		
	    		--urgentCustomer;
	    	} else {	    	
	    		--notUrgentCustomer;	
	    	}
	    	
	    	calculateEmployeeStatus();
	    }
	    
	    public void calculateEmployeeStatus() {
	    	
	    	if (urgentCustomer > 0 || notUrgentCustomer > 0) {
	    		isWorkerOccupied = true;
	    	} else {
	    		isWorkerOccupied = false;
	    	}	    	
	    }
	    
	    public int getUrgentListSize() {
	    	
	    	return urgentCustomer;
	    }
	    
	    public int getNonUrgentListSize() {
		
	    	return notUrgentCustomer;
	    }
	    
	    public boolean isEmployeeOccupied() {
	    	
	    	return isWorkerOccupied;	    	
	    }
	    
	    public int getNumberOfArrivedCustomers() {
	    		
	    	return total;
	    }
}
