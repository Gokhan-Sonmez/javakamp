
public class GamerManager implements GamerService {
	UserValidationService userValidationService;

	public GamerManager(UserValidationService userValidationService) {
		
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if (userValidationService.validate(gamer)) {
			
			System.out.println("Kayýt oldu " + gamer.getFirstName() + "  " + gamer.getLastName());
		}
		else {
			System.out.println("Doðrulama baþarýsýz. Kayýt baþarýsýz");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kayýt silindi "+ gamer.getFirstName() + "  " + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kayýt güncellendi " + gamer.getFirstName() + "  " + gamer.getLastName());
		
	}
}
