/**
 * BankaSubeOkuServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.tcmb.bs.services.bankaSubeOku;

public class BankaSubeOkuServiceLocator extends org.apache.axis.client.Service implements tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOkuService {

    public BankaSubeOkuServiceLocator() {
    }


    public BankaSubeOkuServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BankaSubeOkuServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for bankaSubeOku
    private java.lang.String bankaSubeOku_address = "https://www4.tcmb.gov.tr:30443/TCMB-BS/services/bankaSubeOku";

    public java.lang.String getbankaSubeOkuAddress() {
        return bankaSubeOku_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String bankaSubeOkuWSDDServiceName = "bankaSubeOku";

    public java.lang.String getbankaSubeOkuWSDDServiceName() {
        return bankaSubeOkuWSDDServiceName;
    }

    public void setbankaSubeOkuWSDDServiceName(java.lang.String name) {
        bankaSubeOkuWSDDServiceName = name;
    }

    public tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOku getbankaSubeOku() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(bankaSubeOku_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getbankaSubeOku(endpoint);
    }

    public tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOku getbankaSubeOku(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOkuSoapBindingStub _stub = new tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOkuSoapBindingStub(portAddress, this);
            _stub.setPortName(getbankaSubeOkuWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setbankaSubeOkuEndpointAddress(java.lang.String address) {
        bankaSubeOku_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOku.class.isAssignableFrom(serviceEndpointInterface)) {
                tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOkuSoapBindingStub _stub = new tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOkuSoapBindingStub(new java.net.URL(bankaSubeOku_address), this);
                _stub.setPortName(getbankaSubeOkuWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("bankaSubeOku".equals(inputPortName)) {
            return getbankaSubeOku();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "bankaSubeOkuService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "bankaSubeOku"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("bankaSubeOku".equals(portName)) {
            setbankaSubeOkuEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
