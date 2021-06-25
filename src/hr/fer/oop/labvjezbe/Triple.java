package hr.fer.oop.labvjezbe;

public class Triple<T> {
	
	private T first;
	private T second;
	private T third;
	
	public T getElement(int index) {
		if (index == 1) {
			return first;
		} else if (index == 2) {
			return second;
		} else if (index == 3) {
			return third;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public void setElement(int index, T value) {
		if (index == 1) {
			first = value;
		} else if (index == 2) {
			second = value;
		} else if (index == 3) {
			third = value;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public Triple(T first, T second, T third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
}
