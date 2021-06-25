package hr.fer.oop.cetvrt;

public class UniMasterChef {
	
	private CompetitionEntry[] entries;
	
	private int index = 0;
	
	public UniMasterChef(int noOfEntries) {
		this.entries = new CompetitionEntry[noOfEntries];
	}
	
	public boolean addEntry(CompetitionEntry entry) {
		if (index == 3) {
			return false;
		}
		
		for (CompetitionEntry e: entries) {
			if (e != null && e.equals(entry)) {
				return false;
			}
		}
		
		entries[index++] = entry;
		
		return true;
	}
	
	public Dessert getBestDessert() {
		
		if (index == 0) {
			return null;
		}
		
		double max = entries[0].getRating();
		int maxind = 0;
		
		for (int i = 0; i < index; ++i) {
			if (entries[i].getRating() > max) {
				max = entries[i].getRating();
				maxind = i;
			}
		}
		
		return entries[maxind].getDessert();
		
	}
	
	public static Person[] getInvolvedPeople(CompetitionEntry entry) {
		
		Person[] retval = new Person[4];
		
		int idx = 0;
		
		retval[idx++] = entry.getTeacher();
		
		for (Student s: entry.getStudents()) {
			retval[idx++] = s;
		}
		
		return retval;
	}
}