package interfaces;

public class DatebaseLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Database loglandý : " + message);
		
	}

}
