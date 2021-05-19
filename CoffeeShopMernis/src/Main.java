import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		BaseCustomerManager starbucksCustomerManager =new StarbucksCustomerManager(new MernisServiceManager());
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Engin");
		customer1.setLastName("Demiroð");
		customer1.setDateOfBirth(LocalDate.of(1985, 11, 10));
		customer1.setNationalityId("12347895654");
		Customer customer2 = new Customer(2,"Gürkan","Tutum",LocalDate.of(1969, 7, 27),"65248126622"); 
		neroCustomerManager.save(customer1);
		neroCustomerManager.save(customer2);
		starbucksCustomerManager.save(customer1);
		starbucksCustomerManager.save(customer2);
		
		

	}

}
