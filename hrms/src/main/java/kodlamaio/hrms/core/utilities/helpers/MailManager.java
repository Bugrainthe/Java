package kodlamaio.hrms.core.utilities.helpers;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;

public class MailManager implements MailService {

	@Override
	public Result send(String to, String title, String message) {
		return new SuccessResult("E-posta başarıyla gönderildi.");
	}
}
