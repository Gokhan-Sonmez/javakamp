
public class GamerManager implements GamerService {
	UserValidationService userValidationService;

	public GamerManager(UserValidationService userValidationService) {
		
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if (userValidationService.validate(gamer)) {
			
			System.out.println("Kay�t oldu " + gamer.getFirstName() + "  " + gamer.getLastName());
		}
		else {
			System.out.println("Do�rulama ba�ar�s�z. Kay�t ba�ar�s�z");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kay�t silindi "+ gamer.getFirstName() + "  " + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kay�t g�ncellendi " + gamer.getFirstName() + "  " + gamer.getLastName());
		
	}
}
