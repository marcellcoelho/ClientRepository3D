/**
 * ObjetoServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.repository3d.service;

public class ObjetoServiceServiceLocator extends org.apache.axis.client.Service implements br.com.repository3d.service.ObjetoServiceService {

    public ObjetoServiceServiceLocator() {
    }


    public ObjetoServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ObjetoServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ObjetoServicePort
    private java.lang.String ObjetoServicePort_address = "http://localhost:8080/Repository3D-EJB/ObjetoService";

    public java.lang.String getObjetoServicePortAddress() {
        return ObjetoServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ObjetoServicePortWSDDServiceName = "ObjetoServicePort";

    public java.lang.String getObjetoServicePortWSDDServiceName() {
        return ObjetoServicePortWSDDServiceName;
    }

    public void setObjetoServicePortWSDDServiceName(java.lang.String name) {
        ObjetoServicePortWSDDServiceName = name;
    }

    public br.com.repository3d.service.ObjetoService getObjetoServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ObjetoServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getObjetoServicePort(endpoint);
    }

    public br.com.repository3d.service.ObjetoService getObjetoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.repository3d.service.ObjetoServiceServiceSoapBindingStub _stub = new br.com.repository3d.service.ObjetoServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getObjetoServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setObjetoServicePortEndpointAddress(java.lang.String address) {
        ObjetoServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.repository3d.service.ObjetoService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.repository3d.service.ObjetoServiceServiceSoapBindingStub _stub = new br.com.repository3d.service.ObjetoServiceServiceSoapBindingStub(new java.net.URL(ObjetoServicePort_address), this);
                _stub.setPortName(getObjetoServicePortWSDDServiceName());
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
        if ("ObjetoServicePort".equals(inputPortName)) {
            return getObjetoServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.repository3d.com.br/", "ObjetoServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.repository3d.com.br/", "ObjetoServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ObjetoServicePort".equals(portName)) {
            setObjetoServicePortEndpointAddress(address);
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
