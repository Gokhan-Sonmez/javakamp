import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager = new GamerManager(new NewUserValidationManager());
		Gamer gamer1 = new Gamer(1,"Gökhan","Sönmez",new Date(1989,9,13),"12345678");
		
        gamerManager.add(gamer1);
        
        Game game1 = new Game(1,"Age of Empires",100);
        Game game2 = new Game(1,"Counter-Strike",75);
        
        Campaing campaing1 = new Campaing(1,"Discount campaign",10);
        
        SalesManager salesManager = new SalesManager();
        salesManager.Buy(gamer1, game2);
        salesManager.Discount(campaing1, game2);
        salesManager.ReturnBackGame(game1);
	}

}
