package oop11;

public class HTAList {

	private String[] data = new String[100];
	private int position = 0;
	
	public void add(String value) {
		data[position++] = value;		
	}
	
	public HTAIterator iterator() {
		HTAListIterator iter = new HTAListIterator();
		return iter;
	}
	
	class HTAListIterator implements HTAIterator {		
		
		private int currentPosition = 0;
		
		public String next() {
			String value = data[currentPosition++];
			return value;
		}		
		
		public boolean hasNext() {
			if(currentPosition == position)
				return false;
			return true;
		}
	}
}
