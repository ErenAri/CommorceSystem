package commorceSystem_V1.dataAccess.concretes;

import java.util.List;

import commorceSystem_V1.dataAccess.abstracts.UserDao;
import commorceSystem_V1.entities.abstracts.Entity;
import commorceSystem_V1.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	
	@Override
	public void add(Entity user) {
		System.out.println(((User) user).getFirstName()+" Adl� kullan�c� Hibernate ile eklendi");
		
	}

	@Override
	public void delete(Entity user) {
		System.out.println(((User) user).getFirstName()+" Adl� kullan�c� kald�r�ld�");
		
	}

	@Override
	public void update(Entity user) {
		System.out.println(((User) user).getFirstName()+" Adl� kullan�c� g�ncellendi");		
	}

	@Override
	public Entity getUserByMail(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
