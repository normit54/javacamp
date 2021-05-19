package Adapter;


import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;


import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceManager implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		boolean personControl;
		
		KPSPublicSoapProxy clientMernis = new KPSPublicSoapProxy();
		try {
			personControl = clientMernis.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
			
		
		}  catch (NumberFormatException e) {
			personControl = false;
			e.printStackTrace();
		} catch (RemoteException e) {
			personControl = false;
			e.printStackTrace();
		} 
		
		
		
		
//		catch (Exception e) {
//			personControl=false;
//			e.printStackTrace();
//		}
		return personControl;
		
		
		
	}

}
