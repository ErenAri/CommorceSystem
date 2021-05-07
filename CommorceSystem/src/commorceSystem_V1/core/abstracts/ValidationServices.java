package commorceSystem_V1.core.abstracts;

import commorceSystem_V1.entities.abstracts.Entity;
import commorceSystem_V1.entities.concretes.User;

public interface ValidationServices {
	void sendValidMail(Entity user);
	void verifyToMail(Entity user);

}
