package commorceSystem_V1.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import commorceSystem_V1.entities.abstracts.Entity;
import commorceSystem_V1.entities.concretes.User;

public class Controls {
	public static boolean mailCheck(Entity user) {
		
		return true;
	}
	
	public static boolean passwordCheck(Entity user) {
		
		return true;
	}
	
	public static boolean valMailFormat(Entity user) {
		String mailRegex ="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern mailPat = Pattern.compile(mailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = mailPat.matcher(((User) user).getEmail());
		return matcher.find();
	}
	
	public static boolean nameControl(Entity user) {
		if(((User) user).getFirstName().length()<2||((User) user).getLastName().length()<2) {
			return false;
		}
		else {
			return true;
		}
	
	}
}
