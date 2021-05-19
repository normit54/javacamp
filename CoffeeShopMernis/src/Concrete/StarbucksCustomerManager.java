package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService checkService;

	public StarbucksCustomerManager(ICustomerCheckService checkService) {
		//super();
		this.checkService = checkService;
	}
	
	public void save(Customer customer) {
		
		if (checkService.checkIfRealPerson(customer)) {
			super.save(customer);
			
			
		} else {
			
			System.out.println("Not a valid person");
		}
		
		
	}
	
	
	
	

}
