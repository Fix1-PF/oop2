package oop9;

public class TvDemo {

	public static void main(String[] args) {
		NormalMonitor m1 = new NormalMonitor();                     // Monitor 인터페이스 구현
		HDMonitor m2 = new HDMonitor("4K");                         // Monitor 인터페이스 구현
		CinemaMonitor m3 = new CinemaMonitor();                     // Monitor, Speakable 인터페이스 구현
		LCDCinemaMonitor m4 = new LCDCinemaMonitor();               // Monitor, Speakable, Touchable 인터페이스 구현.
		
		NormalTv tv1 = new NormalTv(m1);
		NormalTv tv2 = new NormalTv(m2);
		NormalTv tv3 = new NormalTv(m3);
		NormalTv tv4 = new NormalTv(m4);
		
		tv1.watch();
		tv2.watch();
		tv3.watch();
		tv4.watch();
	}
}
