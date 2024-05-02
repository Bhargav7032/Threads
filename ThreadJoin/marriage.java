package ThreadJoin;

public class marriage {
	public static void main(String[] args) {
		
		VenueFixing venueFixing=new VenueFixing();
		Weddingcardprinting weddingcardprinting =new Weddingcardprinting();
		Weddingcardsdistridution weddingcardsdistridution=new Weddingcardsdistridution();
		  
		venueFixing.start();
		
		try {
			venueFixing.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		weddingcardprinting.start();
		try {
			weddingcardprinting.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		weddingcardsdistridution.start();;
	}

}
