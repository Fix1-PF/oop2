package oop11;

public class HTAListDemo {

	public static void main(String[] args) {
		HTAList list = new HTAList();
		
		list.add("홍길동");
		list.add("김유신");
		list.add("강감찬");
		list.add("이순신");
		list.add("류관순");
		
		HTAIterator hta = list.iterator();
		
		while(hta.hasNext()) {
			String value = hta.next();
			boolean hasValue = hta.hasNext();
			System.out.println(value + ", " + hasValue);
		}
	}
}
