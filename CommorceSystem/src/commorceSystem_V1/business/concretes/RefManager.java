package commorceSystem_V1.business.concretes;

import java.util.List;

import commorceSystem_V1.business.abstracts.UserService;
import commorceSystem_V1.core.abstracts.RefServices;
import commorceSystem_V1.core.concretes.GoogleRefAdapter;
import commorceSystem_V1.dataAccess.abstracts.UserDao;
import commorceSystem_V1.dataAccess.concretes.HibernateUserDao;
import commorceSystem_V1.entities.abstracts.Entity;
import commorceSystem_V1.entities.concretes.GoogleUser;
import commorceSystem_V1.entities.concretes.User;

public class RefManager implements UserService{
	
	private RefServices refServices;
	UserDao userDao;
	@Override
	public void register(Entity user) {
		refServices = new GoogleRefAdapter();
		userDao = new HibernateUserDao();
		refServices.registerWithRef(((GoogleUser) user).getEmail(), ((GoogleUser)user).getPassword());
		
	}
	@Override
	public void verifyUser(Entity user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void logIn(Entity user,String mail, String password) {
			if(((GoogleUser)user).getEmail()== mail && ((GoogleUser)user).getPassword()==password ) {
				System.out.println("Giriþ yapýldý. Yönlendiriliyorsunuz... "+((GoogleUser)user).getEmail());
			}else {
				System.out.println("Giriþ baþarýsýz! Bilgilerinizi kontrol ediniz.");
			}
		
	}
	@Override
	public List<Entity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
