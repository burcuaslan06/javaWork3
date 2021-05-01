
public class InstructorManager {
	
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " adlý öðretmen" +" "
				+ instructor.getCourseName() + " isimli dersi eklendi." );
	}
	
	public void listCourse(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println(instructor.getCourseName() +" dersler listelendi");
		}
		
	}
	
	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.getCourseName() + " isimli ders silindi.");
	}
}
