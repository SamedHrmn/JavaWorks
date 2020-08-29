
public class InnerExamp {
	
	private final static int SIZE=15;
	private int[] arrayOfInts=new int[SIZE];
	
	public InnerExamp() {
		for(int i=0;i<SIZE;i++)
			arrayOfInts[i]=i;
	}
	
	
	interface DataStructureIterator extends java.util.Iterator<Integer>{}
	
	public void printEven() {
		DataStructureIterator iterator=this.new EvenIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
		}
		System.out.println();
	}
	
	private class EvenIterator implements DataStructureIterator{ //Inner class EvenIterator
		private int nextIndex=0;
		
		public boolean hasNext() {
			return (nextIndex<=SIZE-1);
		}
		
		public Integer next() {
			Integer retValue=Integer.valueOf(arrayOfInts[nextIndex]);
			nextIndex+=2;
			return retValue;
		}
	}

	public static void main(String[] args) {
		InnerExamp ie=new InnerExamp();
		ie.printEven();

	}

}
