package oop4;

public interface ReportDemo {

	public static void main(String[] args) {
		
		String[] names = {"김유신", "강감찬", "이순신", "류관순", "윤봉길"};
		DataOutput do1 = new DataOutput();
		ConsoleDataOutput do2 = new ConsoleDataOutput();
		FileDataOutput do3 = new FileDataOutput("c:/files", "data.txt");
		
		Reporter reporter = new Reporter();
		// Reporter 객체의 setOutputter()메소드를 이용해서 reporter객체의
		// DataOutput멤버변수에 데이터 출력을 지원하는 객체(DataOutput)를 전달해서 조립시킨다.
		reporter.setOutputter(do1);
		reporter.setData(names);
		
		reporter.reporting();
	}
}
