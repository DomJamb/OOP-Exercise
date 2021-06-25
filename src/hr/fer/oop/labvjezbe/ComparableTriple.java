package hr.fer.oop.labvjezbe;

public class ComparableTriple<T extends Comparable<T>> extends Triple<T> implements Comparable<ComparableTriple<T>>{

	public ComparableTriple(T first, T second, T third) {
		super(first, second, third);
	}

	@Override
	public int compareTo(ComparableTriple<T> triple) {
		if (this.getElement(1).compareTo(triple.getElement(1)) < 0) {
			return -1;
		} else if (this.getElement(1).compareTo(triple.getElement(1)) > 0) {
			return 1;
		} else {
			if (this.getElement(2).compareTo(triple.getElement(2)) < 0) {
				return -1;
			} else if (this.getElement(2).compareTo(triple.getElement(2)) > 0) {
				return 1;
			} else {
				if (this.getElement(3).compareTo(triple.getElement(3)) < 0) {
					return -1;
				} else if (this.getElement(3).compareTo(triple.getElement(3)) > 0) {
					return 1;
				} else {
					return 0;
				}
			}
		}	
	}
}
