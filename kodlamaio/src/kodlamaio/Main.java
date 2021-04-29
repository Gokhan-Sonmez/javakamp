package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		CategoryManager categoryManager = new CategoryManager();
		InstructorManager instructorManager = new InstructorManager();
		CourseManager courseManager = new CourseManager();
		StudentManager studentManager = new StudentManager();
		
		Category catyegory1 = new Category(1,"Programlama");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstname("Engin");
		instructor1.setLastname("Demiroğ");
		instructor1.setSpeciality("C#,JAVA");
		instructor1.setPassword("12345");
		
		Student student1 = new Student();
		
		student1.setId(1);
		student1.setFirstname("Gökhan");
		student1.setLastname("Sönmez");
		student1.setCourseId(1);
		student1.setPassword("54321");
		
		Course course1 = new Course(1,1,1,"C#");
		Course course2 = new Course(2,1,1,"Java");
		
		Course[]courses = {course1,course2};
		
		
	for (Course course : courses) {
		System.out.println(course.name);
	}
	
	categoryManager.add(catyegory1);
	instructorManager.add(instructor1);
	
	courseManager.add(course1);
	courseManager.delete(course2);
	
	
	studentManager.listCourse();
	
	
	
	

	}

}
