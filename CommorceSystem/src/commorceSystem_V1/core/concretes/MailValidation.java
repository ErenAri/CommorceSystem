package commorceSystem_V1.core.concretes;

import commorceSystem_V1.core.abstracts.ValidationServices;
import commorceSystem_V1.entities.abstracts.Entity;
import commorceSystem_V1.entities.concretes.User;

public class MailValidation implements ValidationServices{

	@Override
	public void sendValidMail(Entity user) {
			System.out.println("Mail ba�ar� ile "+((User) user).getEmail()+" adl� adrese g�nderildi");
		
	}

	@Override
	public void verifyToMail(Entity user) {
		System.out.println("Mail onayland�! Giri� yap�l�yor...");
		
	}

}
