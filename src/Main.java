
public class Main {

	public static void main(String[] args) {
		
		//User
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Burcu");
		user1.setLastName("Aslan");
		user1.setIdentityNumber("12345678989");
		user1.setEmail("burcu@mail.com");
		user1.setUserName("burcu1");
		user1.setPassword("123");
		
		User user2 = new User(2,"Çağla","Aslan","12345789651", "cagla.com", "cagla1", "12374");
		
		User[] users = new User[] {user1, user2};
		
		UserManager userManager = new UserManager();
		userManager.login(user2);
		userManager.add(user1);
		userManager.listUsers(users);
		
		System.out.println("---------------------------------");
		
		//Student
		
		Student student1 = new Student();
		student1.setId(3);
		student1.setFirstName("Ali");
		student1.setStudentNumber("376");
		student1.setUserName("ali11");
		
		StudentManager studentManager = new StudentManager();
		studentManager.loginStudent(student1);
		studentManager.saveCourse(student1);
		
		
		System.out.println("---------------------------------");
		
		//Instructor
		
		Instructor instructor1 = new Instructor("Java", 4000);
		Instructor instructor2 = new Instructor();
		instructor2.setId(5);
		instructor2.setFirstName("Naz");
		instructor2.setCourseName("C#");
		
		Instructor[] instructors = new Instructor[] {instructor1, instructor2};
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor2);
		instructorManager.listCourse(instructors);
		instructorManager.deleteCourse(instructor1);
		
		System.out.println("---------------------------------");
		
	}

}
