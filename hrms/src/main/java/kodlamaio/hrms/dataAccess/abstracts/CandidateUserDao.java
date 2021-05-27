package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Candidate;

public interface CandidateUserDao extends JpaRepository<Candidate, Integer>{
    DataResult<Candidate> findByIdentityNumber(String tcNo);
}
