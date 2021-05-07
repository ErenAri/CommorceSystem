package commorceSystem_V1.core.concretes;

import commorceSystem_V1.core.abstracts.RefServices;
import commorceSystem_V1.googleAuth.GoogleRef;

public class GoogleRefAdapter implements RefServices{

	GoogleRef googleRefAdapter = new GoogleRef();
	
	@Override
	public void registerWithRef(String mail, String password) {
		GoogleRef googleRefAdapter = new GoogleRef();
		googleRefAdapter.register(mail, password);
	}

	@Override
	public void logInWithRef(String mail, String password) {
		GoogleRef googleRefAdapter = new GoogleRef();
		googleRefAdapter.login(mail, password);
		
	}

}
