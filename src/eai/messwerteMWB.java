package eai;
import java.rmi.RemoteException;

import javax.xml.rpc.holders.FloatWrapperHolder;
import javax.xml.rpc.holders.IntegerWrapperHolder;
import javax.xml.rpc.holders.StringHolder;

import ch.fhnw.www.wi.eai.mwb.MWB;
import ch.fhnw.www.wi.eai.mwb.MWBProxy;

public class messwerteMWB {

	public static void main(String[] args) {
		int[] readings;
		MWB data;
		
		data = new MWBProxy();
		
		
		IntegerWrapperHolder mesID = new IntegerWrapperHolder();
		IntegerWrapperHolder cid = new IntegerWrapperHolder();
		StringHolder measureTarget = new StringHolder();
		FloatWrapperHolder value = new FloatWrapperHolder();
		StringHolder model = new StringHolder();
		StringHolder tariffplan = new StringHolder();
		
		try{
			
			for(int i = 0; i<=9;i++){
			
			readings = data.listeMesIDs();
			data.getMeasureDevice(readings[i],mesID, cid, measureTarget, value, model, tariffplan);
			
			System.out.println("MESID: "+mesID.value);
			System.out.println("CID:" +cid.value);
			System.out.println("MEASURE TRAGET: "+measureTarget.value );
			System.out.println("VALUE: "+value.value);
			System.out.println("MODEL: "+model.value);
			System.out.println("TARIFFPLAN: " +tariffplan.value);
			System.out.println();
			System.out.println();
			
			}
			
		} catch (RemoteException e){
			
			e.printStackTrace();
		}

	}

}


