/**
 * DemoRPCStub.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * Lnd2450.01 v121624103743
 */

package rpc.demo;

public class DemoRPCStub extends com.ibm.ws.webservices.engine.client.Stub implements rpc.demo.DemoRPC_PortType {
    public DemoRPCStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws com.ibm.ws.webservices.engine.WebServicesFault {
        if (service == null) {
            super.service = new com.ibm.ws.webservices.engine.client.Service();
        }
        else {
            super.service = service;
        }
        super.engine = ((com.ibm.ws.webservices.engine.client.Service) super.service).getEngine();
        super.messageContexts = new com.ibm.ws.webservices.engine.MessageContext[3];
        java.lang.String theOption = (java.lang.String)super._getProperty("lastStubMapping");
        if (theOption == null || !theOption.equals("rpc.demo.DemoRPC")) {
                initTypeMapping();
                super._setProperty("lastStubMapping","rpc.demo.DemoRPC");
        }
        super.cachedEndpoint = endpointURL;
        super.connection = ((com.ibm.ws.webservices.engine.client.Service) super.service).getConnection(endpointURL);
    }

    private void initTypeMapping() {
        javax.xml.rpc.encoding.TypeMapping tm = super.getTypeMapping(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
        java.lang.Class javaType = null;
        javax.xml.namespace.QName xmlType = null;
        javax.xml.namespace.QName compQName = null;
        javax.xml.namespace.QName compTypeQName = null;
        com.ibm.ws.webservices.engine.encoding.SerializerFactory sf = null;
        com.ibm.ws.webservices.engine.encoding.DeserializerFactory df = null;
        javaType = rpc.demo.Person.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "person");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _demoPersonOperation0 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getdemoPersonOperation0() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params0 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "person"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "person"), rpc.demo.Person.class, false, false, false, false, true, false), 
          };
        _params0[0].setOption("partQNameString","{http://demo.rpc}person");
        _params0[0].setOption("inputPosition","0");
        _params0[0].setOption("partName","person");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc0 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "demoPersonReturn"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "person"), rpc.demo.Person.class, true, false, false, false, true, false); 
        _returnDesc0.setOption("partQNameString","{http://demo.rpc}person");
        _returnDesc0.setOption("outputPosition","0");
        _returnDesc0.setOption("partName","person");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults0 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        _demoPersonOperation0 = new com.ibm.ws.webservices.engine.description.OperationDesc("demoPerson", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoPerson"), _params0, _returnDesc0, _faults0, "");
        _demoPersonOperation0.setOption("buildNum","Lnd2450.01");
        _demoPersonOperation0.setOption("outputName","demoPersonResponse");
        _demoPersonOperation0.setOption("ResponseNamespace","http://demo.rpc");
        _demoPersonOperation0.setOption("targetNamespace","http://demo.rpc");
        _demoPersonOperation0.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoPersonResponse"));
        _demoPersonOperation0.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "DemoRPC"));
        _demoPersonOperation0.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "DemoRPC"));
        _demoPersonOperation0.setOption("inputName","demoPersonRequest");
        _demoPersonOperation0.setOption("ResponseLocalPart","demoPersonResponse");
        _demoPersonOperation0.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoPersonRequest"));
        _demoPersonOperation0.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _demoPersonOperation0.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _demoPersonOperation0;

    }

    private int _demoPersonIndex0 = 0;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getdemoPersonInvoke0(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_demoPersonIndex0];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(DemoRPCStub._demoPersonOperation0);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_demoPersonIndex0] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public rpc.demo.Person demoPerson(rpc.demo.Person person) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        java.util.Vector _resp = null;
        try {
            _resp = _getdemoPersonInvoke0(new java.lang.Object[] {person}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            throw wsf;
        } 
        try {
            return (rpc.demo.Person) ((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue();
        } catch (java.lang.Exception _exception) {
            return (rpc.demo.Person) super.convert(((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue(), rpc.demo.Person.class);
        }
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _demoHolderOperation1 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getdemoHolderOperation1() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params1 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "fistName"), com.ibm.ws.webservices.engine.description.ParameterDesc.INOUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "lastName"), com.ibm.ws.webservices.engine.description.ParameterDesc.INOUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
          };
        _params1[0].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params1[0].setOption("inputPosition","0");
        _params1[0].setOption("partName","string");
        _params1[1].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params1[1].setOption("inputPosition","1");
        _params1[1].setOption("partName","string");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc1 = new com.ibm.ws.webservices.engine.description.ParameterDesc(null, com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://websphere.ibm.com/webservices/", "Void"), void.class, true, false, false, false, true, true); 
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults1 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        _demoHolderOperation1 = new com.ibm.ws.webservices.engine.description.OperationDesc("demoHolder", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoHolder"), _params1, _returnDesc1, _faults1, "");
        _demoHolderOperation1.setOption("buildNum","Lnd2450.01");
        _demoHolderOperation1.setOption("ResponseNamespace","http://demo.rpc");
        _demoHolderOperation1.setOption("targetNamespace","http://demo.rpc");
        _demoHolderOperation1.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoHolder"));
        _demoHolderOperation1.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "DemoRPC"));
        _demoHolderOperation1.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "DemoRPC"));
        _demoHolderOperation1.setOption("ResponseLocalPart","demoHolder");
        _demoHolderOperation1.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoHolder"));
        _demoHolderOperation1.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _demoHolderOperation1.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _demoHolderOperation1;

    }

    private int _demoHolderIndex1 = 1;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getdemoHolderInvoke1(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_demoHolderIndex1];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(DemoRPCStub._demoHolderOperation1);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_demoHolderIndex1] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public void demoHolder(javax.xml.rpc.holders.StringHolder fistName, javax.xml.rpc.holders.StringHolder lastName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        java.util.Vector _resp = null;
        try {
            _resp = _getdemoHolderInvoke1(new java.lang.Object[] {fistName.value, lastName.value}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            throw wsf;
        } 
        for (int _i = 0; _i < _resp.size(); ++_i) {
            com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue _param = (com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(_i);
            if (com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "fistName").equals(_param.getQName())) {
                try {
                    fistName.value = (java.lang.String) _param.getValue();
                } catch (java.lang.Exception _exception) {
                    fistName.value = (java.lang.String) super.convert(_param.getValue(), java.lang.String.class);
                }
            }
            else if (com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "lastName").equals(_param.getQName())) {
                try {
                    lastName.value = (java.lang.String) _param.getValue();
                } catch (java.lang.Exception _exception) {
                    lastName.value = (java.lang.String) super.convert(_param.getValue(), java.lang.String.class);
                }
            }
        }
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _demoHandlerOperation2 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getdemoHandlerOperation2() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params2 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "person"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "person"), rpc.demo.Person.class, false, false, false, false, true, false), 
          };
        _params2[0].setOption("partQNameString","{http://demo.rpc}person");
        _params2[0].setOption("inputPosition","0");
        _params2[0].setOption("partName","person");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc2 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "demoHandlerReturn"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "person"), rpc.demo.Person.class, true, false, false, false, true, false); 
        _returnDesc2.setOption("partQNameString","{http://demo.rpc}person");
        _returnDesc2.setOption("outputPosition","0");
        _returnDesc2.setOption("partName","person");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults2 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        _demoHandlerOperation2 = new com.ibm.ws.webservices.engine.description.OperationDesc("demoHandler", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoHandler"), _params2, _returnDesc2, _faults2, "");
        _demoHandlerOperation2.setOption("buildNum","Lnd2450.01");
        _demoHandlerOperation2.setOption("outputName","demoHandlerResponse");
        _demoHandlerOperation2.setOption("ResponseNamespace","http://demo.rpc");
        _demoHandlerOperation2.setOption("targetNamespace","http://demo.rpc");
        _demoHandlerOperation2.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoHandlerResponse"));
        _demoHandlerOperation2.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "DemoRPC"));
        _demoHandlerOperation2.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "DemoRPC"));
        _demoHandlerOperation2.setOption("inputName","demoHandlerRequest");
        _demoHandlerOperation2.setOption("ResponseLocalPart","demoHandlerResponse");
        _demoHandlerOperation2.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoHandlerRequest"));
        _demoHandlerOperation2.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _demoHandlerOperation2.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _demoHandlerOperation2;

    }

    private int _demoHandlerIndex2 = 2;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getdemoHandlerInvoke2(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_demoHandlerIndex2];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(DemoRPCStub._demoHandlerOperation2);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_demoHandlerIndex2] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public rpc.demo.Person demoHandler(rpc.demo.Person person) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        java.util.Vector _resp = null;
        try {
            _resp = _getdemoHandlerInvoke2(new java.lang.Object[] {person}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            throw wsf;
        } 
        try {
            return (rpc.demo.Person) ((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue();
        } catch (java.lang.Exception _exception) {
            return (rpc.demo.Person) super.convert(((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue(), rpc.demo.Person.class);
        }
    }

    private static void _staticInit() {
        _demoHandlerOperation2 = _getdemoHandlerOperation2();
        _demoHolderOperation1 = _getdemoHolderOperation1();
        _demoPersonOperation0 = _getdemoPersonOperation0();
    }

    static {
       _staticInit();
    }
}
