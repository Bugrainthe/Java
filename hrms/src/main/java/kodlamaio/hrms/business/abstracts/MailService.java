package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Users;

public interface MailService {
	
	Result sendMail(Users users);
}
