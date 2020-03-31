package oop7;

import java.util.Arrays;

public class Lotto {

	private int[] lottoNumbers = new int[6];
	private int position = 0;

	// 전체 공개된 메소드
	public int[] generateNumber() {
		clearLottoNumbers();
		while(true) {
			int number = (int)(Math.random()*45 + 1);
			
			if(!isExist(number)) {
				lottoNumbers[position] = number;
				position++;
			}
			
			if(position == 6)
				break;
		}
		Arrays.sort(lottoNumbers);
		return lottoNumbers;
	}
	
	// 내부적으로만 사용되는 메소드
	private void clearLottoNumbers() {
		for(int i = 0; i < 6; i++) 
			lottoNumbers[i] = 0;		
		position = 0;
	}
	
	// 내부적으로만 사용되는 메소드
	private boolean isExist(int number) {
		
		for(int i = 0; i < lottoNumbers.length; i++) {
			if(number == lottoNumbers[i])
				return true;
		}
		
		return false;
	}
}
