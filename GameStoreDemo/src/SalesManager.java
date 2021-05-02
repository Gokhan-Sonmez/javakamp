
public class SalesManager implements SellingService{

	@Override
	public void Buy(Gamer gamer, Game game) {
		System.out.println("Gamer : " + gamer.getFirstName() +" "+ gamer.getLastName() + " "+ "buying  " + game.getName());
		System.out.println("No discount price: " + game.getPrice());
		System.out.println("--------------------------------------");
	}

	@Override
	public void Discount(Campaing campaing, Game game) {
		
		System.out.println("Discounted price: " + (game.getPrice() - (game.getPrice() * (campaing.getDiscountRate() / 100))));
		System.out.println("--------------------------------------");
	}

	@Override
	public void ReturnBackGame(Game game) {
		System.out.println(game.getName() + " " + "The game is returned");
		
	}

}
