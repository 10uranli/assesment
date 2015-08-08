
public class App {
	public static void main(String [ ] args) {
		Human human1 = new Human();
		Beer deer1 = new Beer();
		Lion lion1 = new Lion();

		FeedingService feedingService = new FeedingService();
		
		feedingService.feedWithPlant(deer1);

		feedingService.feedWithFish(human1);
		feedingService.feedWithPlant(human1);

		feedingService.feedWithFish(lion1);
	}
}
//MANTIKSAL OLMASI ÝÇÝN LÝON ETCIL  GEYIK OTCUL HUMAN ISE HEM ETCIL HEM OTCUL OLMALI YANI HUMANIN IMLEMENT ETTIGI INTERFACE
//DEÝÐER ÝKÝSÝNE EXTEND ETMELÝ