/**
 * MWBService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.fhnw.www.wi.eai.mwb;

public interface MWBService extends javax.xml.rpc.Service {
    public java.lang.String getMWBPortAddress();

    public ch.fhnw.www.wi.eai.mwb.MWB getMWBPort() throws javax.xml.rpc.ServiceException;

    public ch.fhnw.www.wi.eai.mwb.MWB getMWBPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
