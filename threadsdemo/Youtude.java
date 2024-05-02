package threadsdemo;

public class Youtude {
	public static void main(String []args) {
	
    Streaming streaming = new Streaming();
    Playvideo playvideo = new Playvideo();
    
    streaming.start();
    playvideo.start();
	}

}
