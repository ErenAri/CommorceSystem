package commorceSystem_V1.business.abstracts;

import java.util.List;

import commorceSystem_V1.entities.abstracts.Entity;
import commorceSystem_V1.entities.concretes.GoogleUser;
import commorceSystem_V1.entities.concretes.User;

public interface UserService {
	void register(Entity user);
	void verifyUser(Entity user);
	void logIn(Entity user,String mail, String password);
	List<Entity> getAll();
}
