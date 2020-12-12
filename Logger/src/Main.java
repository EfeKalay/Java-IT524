import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		BaseLogger[] loggers = new BaseLogger[] {new EmailLogger(), new DatabaseLogger(), new FileLogger()};
		
		for (BaseLogger logger : loggers) {
			
			CustomerManager customerManager = new CustomerManager(logger);
			
			customerManager.add();
			customerManager.delete();
			customerManager.update();	
		}
			
	}

}


