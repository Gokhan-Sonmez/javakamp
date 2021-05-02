
public class CampaingManager implements CampaingService {

	@Override
	public void add(Campaing campaing) {
		System.out.println(campaing.getName() + " Added");
		
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println(campaing.getName() + " Deleted");
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println(campaing.getName() + " Updated");
		
	}

}
