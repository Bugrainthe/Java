package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerUserDao extends JpaRepository<Employer, Integer>{
	DataResult<Employer> findByMail(String mail);
}
