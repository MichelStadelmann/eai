/**
 * MWB.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.fhnw.www.wi.eai.mwb;

public interface MWB extends java.rmi.Remote {
    public void getCustomer(java.lang.String queryFirstName, java.lang.String queryLastName, javax.xml.rpc.holders.IntegerWrapperHolder cid, javax.xml.rpc.holders.StringHolder firstName, javax.xml.rpc.holders.StringHolder lastName, javax.xml.rpc.holders.StringHolder street, javax.xml.rpc.holders.StringHolder zip_town, javax.xml.rpc.holders.StringHolder customerSeg) throws java.rmi.RemoteException;
    public java.lang.String[] listCustomerLastNames() throws java.rmi.RemoteException;
    public int[] listeMesIDForCustomer(int queryCID) throws java.rmi.RemoteException;
    public void printMeasureDevice() throws java.rmi.RemoteException;
    public int[] listeMesIDs() throws java.rmi.RemoteException;
    public void printCustomers() throws java.rmi.RemoteException;
    public void getMeasureDevice(int queryMesID, javax.xml.rpc.holders.IntegerWrapperHolder mesID, javax.xml.rpc.holders.IntegerWrapperHolder cid, javax.xml.rpc.holders.StringHolder measureTarget, javax.xml.rpc.holders.FloatWrapperHolder value, javax.xml.rpc.holders.StringHolder model, javax.xml.rpc.holders.StringHolder tariffplan) throws java.rmi.RemoteException;
}
