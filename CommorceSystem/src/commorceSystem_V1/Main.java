package commorceSystem_V1;

import commorceSystem_V1.business.abstracts.UserService;
import commorceSystem_V1.business.concretes.RefManager;
import commorceSystem_V1.business.concretes.UserManager;
import commorceSystem_V1.entities.abstracts.Entity;
import commorceSystem_V1.entities.concretes.GoogleUser;
import commorceSystem_V1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
			
		Entity gUser = new GoogleUser("erenari27@gmail.com","272727");
		Entity user1 = new User(1,"Eren","Arı","erenari42@mail.com","424242");
		
		UserService refManager = new RefManager();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		UserService userManager = new UserManager();
		
		refManager.register(gUser);
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		userManager.register(user1);
		
		userManager.verifyUser(user1);
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		userManager.verifyUser(gUser);
		
		refManager.logIn(gUser, "erenari27@gmail.com", "272727");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		userManager.logIn(user1, "YANLIŞ MAİL", "YANLIŞ ŞİFRE");
	}

}
