package eai;
import java.rmi.RemoteException;

import javax.xml.rpc.holders.IntegerWrapperHolder;
import javax.xml.rpc.holders.StringHolder;

import ch.fhnw.www.wi.eai.mwb.MWB;
import ch.fhnw.www.wi.eai.mwb.MWBProxy;

public class MyClient {

	public static void main(String[] args) {
		String[] customers;
		MWB client;
		

		client = new MWBProxy();
		
		IntegerWrapperHolder cid = new IntegerWrapperHolder();
		StringHolder firstName = new StringHolder();
		StringHolder lastName = new StringHolder();
		StringHolder street = new StringHolder();
		StringHolder zip_town = new StringHolder();
		StringHolder customerSeg = new StringHolder();
		
		try {
			
			
			for(int i = 0; i<=5;i++){
			
			customers = client.listCustomerLastNames();
			client.getCustomer("", customers[i], cid, firstName, lastName, street, zip_town, customerSeg);
			
			System.out.println("CUSTOMER: " + customers[i]);
			System.out.println("CID: "+cid.value);
			System.out.println("FIRST: " +firstName.value);
			System.out.println("LAST: "+lastName.value);
			System.out.println("STREET: "+street.value);
			System.out.println("TOWN: "+zip_town.value);
			System.out.println("SEG: "+customerSeg.value);
			System.out.println();
			System.out.println();
			
			}
			
		} catch (RemoteException e){
			
			e.printStackTrace();
		
		
			
			
		}
		
	}

}
