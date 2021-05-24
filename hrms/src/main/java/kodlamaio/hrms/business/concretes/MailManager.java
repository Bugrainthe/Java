package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.MailService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.Users;

public class MailManager implements MailService {

	@Override
	public Result sendMail(Users users) {		
		return new SuccessResult("Mail başarıyla gönderildi: " + users.getMail());
	}

}
