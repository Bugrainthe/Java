package kodlamaio.hrms.core.adapters;

public interface UsersCheckService {
	
	boolean checkIfRealPerson(String identityNumber, String name, String lastName, String birthYear);
}
