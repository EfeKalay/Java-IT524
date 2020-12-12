
public class CustomerManager {
	
	private BaseLogger baseLogger;
	
	public CustomerManager(BaseLogger logger) {
		
		baseLogger = logger;

		
	}
	
	public void add() {
		
		baseLogger.log("Customer added.");
		
	}
	
	public void update() {
		
		baseLogger.log("Customer updated.");
		
	}
	
	public void delete() {
		
		baseLogger.log("Customer deleted.");
		
	}
	
	}
