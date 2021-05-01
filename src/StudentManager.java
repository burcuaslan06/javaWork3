
public class StudentManager {
	
	public void loginStudent(User student) {
		System.out.println(student.getUserName() + " kullanýcý isimli öðrenci giriþ yaptý" );
	}
	
	public void saveCourse(User student) {
		System.out.println(student.getFirstName() +" isimli öðrenci ders kaydýný oluþturdu.");
	}
	
}
