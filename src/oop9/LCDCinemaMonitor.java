package oop9;

public class LCDCinemaMonitor extends AbstractMonitor implements Speakable, Touchable{
	
	private String screenSize;
	private int volume;
	
	public LCDCinemaMonitor() {
		screenSize = "30인치";
		volume = 30;
	}
	
	public LCDCinemaMonitor(String screeSize, int volume) {
		this.screenSize = screeSize;
		this.volume = volume;
	}
	
	@Override
	public void display() {
		
		System.out.println("["+screenSize+"] 크기의 LCD 시네마 모니터로 동영상을 재생합니다.");
		sound();
	}
	
	@Override
	public void touch() {
		System.out.println("화면의 메뉴를 터치해서 장면을 전환합니다.");
		
	}
	
	@Override
	public void sound() {
		System.out.println("볼륨 ["+volume+"] 크기로 소리를 재생합니다.");
	}
	
	@Override
	public void volumeDown() {
		volume -= 5;
		if(volume < Speakable.MIN_VOLUME) {
			volume = Speakable.MIN_VOLUME;
		}
		
	}
	
	@Override
	public void volumeUp() {
		volume += 5;	
		if(volume > Speakable.MAX_VOLUME) {
			volume = Speakable.MAX_VOLUME;
		}
	}
}
