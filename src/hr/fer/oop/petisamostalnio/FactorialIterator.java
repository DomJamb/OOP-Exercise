package hr.fer.oop.petisamostalnio;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FactorialIterator implements Iterator<Integer> {
	
	private int numOfInd;
	private int ind = 0;
	
	public FactorialIterator(int num) {
		if (num < 0) {
			throw new IllegalArgumentException();
		}
		numOfInd = num;
	}
	
	@Override
	public boolean hasNext() {
		if (ind < numOfInd) {
			return true;
		}
		return false;
	}

	@Override
	public Integer next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			ind++;
			int fact = 1;
			for (int i = 2; i < ind; ++i) {
				fact *= i;
			}
			return fact;
	}
	
//	private int maxInd, currInd, num;
//	
//	public FactorialIterator(int maxNum) {
//		if(maxNum < 0)
//			throw new RuntimeException();
//		currInd = num = 1;
//		this.maxInd = maxNum;
//	}
//
//	@Override
//	public boolean hasNext() {
//		return currInd <= maxInd;
//	}
//
//	@Override
//	public Integer next() {
//		int ret = num;
//		if(!hasNext())
//			throw new NoSuchElementException();
//		num = num * currInd ++;
//		return ret;
//	}
	
}
