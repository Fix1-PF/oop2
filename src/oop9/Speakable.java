package oop9;

// 인터페이스 - 기획서
// 사운드 출력이 지원되는 모든 모니터가 갖춰야 하는 기능을 정의한다.
// 사운드 출력이 지원되는 모든 모니터는 최소/최대 범위내의 소리크기만을 가지도록 상수를 정의한다.
public interface Speakable {

	public static final int MIN_VOLUME = 0;
	public static final int MAX_VOLUME = 100;
	
	void sound();
	void volumeUp();
	void volumeDown();
}
