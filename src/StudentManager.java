
public class StudentManager {
	
	public void loginStudent(User student) {
		System.out.println(student.getUserName() + " kullan�c� isimli ��renci giri� yapt�" );
	}
	
	public void saveCourse(User student) {
		System.out.println(student.getFirstName() +" isimli ��renci ders kayd�n� olu�turdu.");
	}
	
}
