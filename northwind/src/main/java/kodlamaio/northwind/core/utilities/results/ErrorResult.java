package kodlamaio.northwind.core.utilities.results;

public class ErrorResult extends Result{//Hatalı olması durumunda
	
	public ErrorResult() {
		super(false);
	}
	
	public ErrorResult(String message) {
		super(false, message);
	}
	
	
}
