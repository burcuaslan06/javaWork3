
public class UserManager {
	
	public void login(User user) {
		System.out.println(user.getUserName() +" kullan�c� giri� yapt�");
	}
	
	public void add(User user) {
		System.out.println(user.getFirstName() +" isimli kullan�c� eklendi");
	}

	public void listUsers(User[] users) {
		
		for (User user : users) {
			System.out.println("Kullan�c� Ad� ve Soyad�: " +user.getFirstName()+ " " + user.getLastName() + " " 
				+ "Email : " +user.getEmail() );
		}
	
	}
}
