package commorceSystem_V1.business.concretes;

import java.util.List;

import commorceSystem_V1.business.abstracts.UserService;
import commorceSystem_V1.core.abstracts.ValidationServices;
import commorceSystem_V1.core.concretes.Controls;
import commorceSystem_V1.core.concretes.MailValidation;
import commorceSystem_V1.dataAccess.abstracts.UserDao;
import commorceSystem_V1.dataAccess.concretes.HibernateUserDao;
import commorceSystem_V1.entities.abstracts.Entity;
import commorceSystem_V1.entities.concretes.GoogleUser;
import commorceSystem_V1.entities.concretes.User;

public class UserManager implements UserService{

	public UserDao userDao = new HibernateUserDao();
	public Controls controls;
	public ValidationServices validationServices;
	
	public UserManager() {}

	@Override
	public void register(Entity user) {
		if(controls.nameControl(user)==false) {
			System.out.println("Ad ve soyad en az iki karakter olmalıdır");
		}else if(controls.passwordCheck(user)==false) {
			System.out.println("Parola en az 6 karakter olmalıdır");
		}else if(controls.valMailFormat(user)==false) {
			System.out.println("E-posta formatınızı kontrol ediniz");
		}else if(controls.mailCheck(user)==false) {
			System.out.println("E-Posta alınmış");
		}else {
			System.out.println("Yeni kullanıcı oluşturuldu: "+((User) user).getFirstName()+" "+((User) user).getLastName());
			validationServices = new MailValidation();
			validationServices.sendValidMail(user);
			userDao.add(user);
		}
		
	}

	@Override
	public void verifyUser(Entity user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logIn(Entity user, String mail, String password) {
		if(((User) user).getEmail()== mail && ((User) user).getPassword() == password) {
			System.out.println("Giriş Yapıldı. Yönlendiriliyorsunuz...");
		}else {
			System.out.println("Giriş bilgilerinizi kontrol edip tekrar deneyiniz!");
		}
		
	}

	@Override
	public List<Entity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

	

}
