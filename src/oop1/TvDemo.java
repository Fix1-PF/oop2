package oop1;

public class TvDemo {

	public static void main(String[] args) {
		                                                 
		Tv tv = new Tv();                                
		tv.power();                                      
		tv.channelUp();                                  
		tv.channelDown();		                         
		                                                 
		CaptionTv captionTv = new CaptionTv();
		captionTv.power();
		captionTv.displayCaption("시각장애우를 위한 자막을 표시합니다.");
		
		IPTv ipTv = new IPTv();                          
		ipTv.power();                                    //	Tv
		ipTv.channelUp();                                //	Tv
		ipTv.channelDown();                              //	Tv
		ipTv.ip = "143.56.78.123";                       //	IPTv
		ipTv.internet("www.daum.net");                   //	IPTv
		                                                 
		NetflixTv netflixTv = new NetflixTv();           
		netflixTv.power();                               //	Tv
		netflixTv.channelUp();                           //	Tv
		netflixTv.channelDown();                         //	Tv
		netflixTv.ip = "211.167.24.123";                 //	IPTv
		netflixTv.internet("www.daum.net");              //	IPTv
		netflixTv.membership = "standard";               //	NetflixTv
		netflixTv.watchMovie("더블타겟");                //	NetflixTv
		                                                 
	}
}
