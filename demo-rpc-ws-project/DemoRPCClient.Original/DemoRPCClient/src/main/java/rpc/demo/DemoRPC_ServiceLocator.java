
package rpc.demo;

public class DemoRPC_ServiceLocator extends com.ibm.ws.webservices.multiprotocol.AgnosticService implements com.ibm.ws.webservices.multiprotocol.GeneratedService, rpc.demo.DemoRPC_Service {

    public DemoRPC_ServiceLocator() {
        super(com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
           "http://demo.rpc",
           "DemoRPC"));

        context.setLocatorName("rpc.demo.DemoRPC_ServiceLocator");
    }

    public DemoRPC_ServiceLocator(com.ibm.ws.webservices.multiprotocol.ServiceContext ctx) {
        super(ctx);
        context.setLocatorName("rpc.demo.DemoRPC_ServiceLocator");
    }

    // Use to get a proxy class for demoRPC
    private final java.lang.String demoRPC_address = "http://localhost:9080/DemoRPC/services/DemoRPC";

    public java.lang.String getDemoRPCAddress() {
        if (context.getOverriddingEndpointURIs() == null) {
            return demoRPC_address;
        }
        String overriddingEndpoint = (String) context.getOverriddingEndpointURIs().get("DemoRPC");
        if (overriddingEndpoint != null) {
            return overriddingEndpoint;
        }
        else {
            return demoRPC_address;
        }
    }

    private java.lang.String demoRPCPortName = "DemoRPC";

    // The WSDD port name defaults to the port name.
    private java.lang.String demoRPCWSDDPortName = "DemoRPC";

    public java.lang.String getDemoRPCWSDDPortName() {
        return demoRPCWSDDPortName;
    }

    public void setDemoRPCWSDDPortName(java.lang.String name) {
        demoRPCWSDDPortName = name;
    }

    public rpc.demo.DemoRPC_PortType getDemoRPC() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getDemoRPCAddress());
        }
        catch (java.net.MalformedURLException e) {
            return null; // unlikely as URL was validated in WSDL2Java
        }
        return getDemoRPC(endpoint);
    }

    public rpc.demo.DemoRPC_PortType getDemoRPC(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        rpc.demo.DemoRPC_PortType _stub =
            (rpc.demo.DemoRPC_PortType) getStub(
                demoRPCPortName,
                (String) getPort2NamespaceMap().get(demoRPCPortName),
                rpc.demo.DemoRPC_PortType.class,
                "rpc.demo.DemoRPCStub",
                portAddress.toString());
        if (_stub instanceof com.ibm.ws.webservices.engine.client.Stub) {
            ((com.ibm.ws.webservices.engine.client.Stub) _stub).setPortName(demoRPCWSDDPortName);
        }
        return _stub;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (rpc.demo.DemoRPC_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                return getDemoRPC();
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("WSWS3273E: Error: There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        String inputPortName = portName.getLocalPart();
        if ("DemoRPC".equals(inputPortName)) {
            return getDemoRPC();
        }
        else  {
            throw new javax.xml.rpc.ServiceException();
        }
    }

    public void setPortNamePrefix(java.lang.String prefix) {
        demoRPCWSDDPortName = prefix + "/" + demoRPCPortName;
    }

    public javax.xml.namespace.QName getServiceName() {
        return com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "DemoRPC");
    }

    private java.util.Map port2NamespaceMap = null;

    protected synchronized java.util.Map getPort2NamespaceMap() {
        if (port2NamespaceMap == null) {
            port2NamespaceMap = new java.util.HashMap();
            port2NamespaceMap.put(
               "DemoRPC",
               "http://schemas.xmlsoap.org/wsdl/soap/");
        }
        return port2NamespaceMap;
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            String serviceNamespace = getServiceName().getNamespaceURI();
            for (java.util.Iterator i = getPort2NamespaceMap().keySet().iterator(); i.hasNext(); ) {
                ports.add(
                    com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                        serviceNamespace,
                        (String) i.next()));
            }
        }
        return ports.iterator();
    }

    public javax.xml.rpc.Call[] getCalls(javax.xml.namespace.QName portName) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            throw new javax.xml.rpc.ServiceException("WSWS3062E: Error: portName should not be null.");
        }
        if  (portName.getLocalPart().equals("DemoRPC")) {
            return new javax.xml.rpc.Call[] {
                createCall(portName, "demoPerson", "demoPersonRequest"),
                createCall(portName, "demoHolder", "null"),
                createCall(portName, "demoHandler", "demoHandlerRequest"),
            };
        }
        else {
            throw new javax.xml.rpc.ServiceException("WSWS3062E: Error: portName should not be null.");
        }
    }
}
