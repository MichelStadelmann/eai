package ch.fhnw.www.wi.eai.mwb;

public class MWBProxy implements ch.fhnw.www.wi.eai.mwb.MWB {
  private String _endpoint = null;
  private ch.fhnw.www.wi.eai.mwb.MWB mWB = null;
  
  public MWBProxy() {
    _initMWBProxy();
  }
  
  public MWBProxy(String endpoint) {
    _endpoint = endpoint;
    _initMWBProxy();
  }
  
  private void _initMWBProxy() {
    try {
      mWB = (new ch.fhnw.www.wi.eai.mwb.MWBServiceLocator()).getMWBPort();
      if (mWB != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mWB)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mWB)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mWB != null)
      ((javax.xml.rpc.Stub)mWB)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ch.fhnw.www.wi.eai.mwb.MWB getMWB() {
    if (mWB == null)
      _initMWBProxy();
    return mWB;
  }
  
  public void getCustomer(java.lang.String queryFirstName, java.lang.String queryLastName, javax.xml.rpc.holders.IntegerWrapperHolder cid, javax.xml.rpc.holders.StringHolder firstName, javax.xml.rpc.holders.StringHolder lastName, javax.xml.rpc.holders.StringHolder street, javax.xml.rpc.holders.StringHolder zip_town, javax.xml.rpc.holders.StringHolder customerSeg) throws java.rmi.RemoteException{
    if (mWB == null)
      _initMWBProxy();
    mWB.getCustomer(queryFirstName, queryLastName, cid, firstName, lastName, street, zip_town, customerSeg);
  }
  
  public java.lang.String[] listCustomerLastNames() throws java.rmi.RemoteException{
    if (mWB == null)
      _initMWBProxy();
    return mWB.listCustomerLastNames();
  }
  
  public int[] listeMesIDForCustomer(int queryCID) throws java.rmi.RemoteException{
    if (mWB == null)
      _initMWBProxy();
    return mWB.listeMesIDForCustomer(queryCID);
  }
  
  public void printMeasureDevice() throws java.rmi.RemoteException{
    if (mWB == null)
      _initMWBProxy();
    mWB.printMeasureDevice();
  }
  
  public int[] listeMesIDs() throws java.rmi.RemoteException{
    if (mWB == null)
      _initMWBProxy();
    return mWB.listeMesIDs();
  }
  
  public void printCustomers() throws java.rmi.RemoteException{
    if (mWB == null)
      _initMWBProxy();
    mWB.printCustomers();
  }
  
  public void getMeasureDevice(int queryMesID, javax.xml.rpc.holders.IntegerWrapperHolder mesID, javax.xml.rpc.holders.IntegerWrapperHolder cid, javax.xml.rpc.holders.StringHolder measureTarget, javax.xml.rpc.holders.FloatWrapperHolder value, javax.xml.rpc.holders.StringHolder model, javax.xml.rpc.holders.StringHolder tariffplan) throws java.rmi.RemoteException{
    if (mWB == null)
      _initMWBProxy();
    mWB.getMeasureDevice(queryMesID, mesID, cid, measureTarget, value, model, tariffplan);
  }
  
  
}