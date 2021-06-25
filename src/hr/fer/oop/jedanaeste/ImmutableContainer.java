package hr.fer.oop.jedanaeste;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ImmutableContainer implements Iterable<Integer>{
	
	private Integer[] numbers;
	
	public ImmutableContainer (Integer... num) {
		
		numbers = new Integer[num.length];
		for(int i = 0; i<num.length; i++)
			numbers[i] = num[i];
	}

//	@Override
//	public Iterator<Integer> iterator() {
//		return new StaticNestedClassIterator(this);
//	}
//	
//	private static class StaticNestedClassIterator implements Iterator<Integer> {
//
//		private int index;
//		private ImmutableContainer col;
//		
//		public StaticNestedClassIterator(ImmutableContainer col) {
//			this.col = col;
//			this.index = col.numbers.length - 1;
//		}
//		
//		@Override
//		public boolean hasNext() {
//			return index >= 0;
//		}
//
//		@Override
//		public Integer next() {
//			
//			if(!hasNext()) {
//				throw new NoSuchElementException("No more numbers are available.");
//			}
//			
//			index = index - 2;
//			
//			return col.numbers[index + 2];
//		}
		
	
	
	
//		@Override
//		public Iterator<Integer> iterator() {
//			return new InnerClassIterator();
//		}
//
//  
//		private class InnerClassIterator implements Iterator<Integer> {
//			
//			private int index = 0;
//			
//			@Override
//			public boolean hasNext() {
//				return index < numbers.length;
//			}
//
//			@Override
//			public Integer next() {
//				if(!hasNext()) {
//					throw new NoSuchElementException("No more numbers are available.");
//				}
//				return numbers[index++];
//			}
//		}	
		
	
	
//		@Override
//		public Iterator<Integer> iterator() {
//			 return createLocalIterator();
//		}
//
//		private Iterator<Integer> createLocalIterator() {
//			class LocalNamedClassIterator implements Iterator<Integer> {
//
//				private int index = 0;
//
//				@Override
//				public boolean hasNext() {
//					return index < numbers.length;
//				}
//
//				@Override
//				public Integer next() {
//					if(!hasNext()) {
//						throw new NoSuchElementException("No more numbers are available.");
//					}			
//					return numbers[index++];
//				}
//			}
//
//			return new LocalNamedClassIterator();
//		}
		
		
		
		@Override
		public Iterator<Integer> iterator() {
			// Backward iterator 
			return new Iterator<>() {  
				private int index;
				{  
					index = numbers.length - 1;
				}
				
				@Override
				public boolean hasNext() {
					return index >= 0;
				}

				@Override
				public Integer next() {
					if(!hasNext()) {
						throw new NoSuchElementException("No more numbers are available.");
					}
					return numbers[index--];
				}
			};
		}
}
