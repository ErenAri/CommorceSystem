package commorceSystem_V1.dataAccess.abstracts;

import java.util.List;

import commorceSystem_V1.entities.abstracts.Entity;
import commorceSystem_V1.entities.concretes.User;

public interface UserDao {
	void add(Entity user);
	void delete(Entity user);
	void update(Entity user);
	Entity getUserByMail(String mail);
	List<Entity> getAll();
}
