package kodlamaio.hrms.core.utilities.helpers;

import kodlamaio.hrms.core.utilities.results.Result;

public interface MailService {
	Result send(String to, String title, String message);
}
