
public class UserManager {
	
	public void login(User user) {
		System.out.println(user.getUserName() +" kullanýcý giriþ yaptý");
	}
	
	public void add(User user) {
		System.out.println(user.getFirstName() +" isimli kullanýcý eklendi");
	}

	public void listUsers(User[] users) {
		
		for (User user : users) {
			System.out.println("Kullanýcý Adý ve Soyadý: " +user.getFirstName()+ " " + user.getLastName() + " " 
				+ "Email : " +user.getEmail() );
		}
	
	}
}
