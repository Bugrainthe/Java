package kodlamaio.northwind.core.utilities.results;

public class SuccessResult extends Result{//Başarılı olması durumunda
	
		public SuccessResult() {
			super(true);
		}
		
		public SuccessResult(String message) {
			super(true, message);
		}
		
		
}
