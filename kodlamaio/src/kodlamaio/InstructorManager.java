package kodlamaio;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println("instructor added " + instructor.firstname + instructor.lastname  );
	}
	public void delete(Instructor instructor) {
		System.out.println("instructor deleted " + instructor.firstname + instructor.lastname );
	}

}
