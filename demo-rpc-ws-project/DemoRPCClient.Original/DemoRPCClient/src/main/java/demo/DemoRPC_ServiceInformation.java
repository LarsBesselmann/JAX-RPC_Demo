/**
 * DemoRPC_ServiceInformation.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * Lnd2450.01 v121624103743
 */

package rpc.demo;

public class DemoRPC_ServiceInformation implements com.ibm.ws.webservices.multiprotocol.ServiceInformation {

    private static java.util.Map operationDescriptions;
    private static java.util.Map typeMappings;

    static {
         initOperationDescriptions();
         initTypeMappings();
    }

    private static void initOperationDescriptions() { 
        operationDescriptions = new java.util.HashMap();

        java.util.Map inner0 = new java.util.HashMap();

        java.util.List list0 = new java.util.ArrayList();
        inner0.put("demoHandler", list0);

        com.ibm.ws.webservices.engine.description.OperationDesc demoHandler0Op = _demoHandler0Op();
        list0.add(demoHandler0Op);

        java.util.List list1 = new java.util.ArrayList();
        inner0.put("demoHolder", list1);

        com.ibm.ws.webservices.engine.description.OperationDesc demoHolder1Op = _demoHolder1Op();
        list1.add(demoHolder1Op);

        java.util.List list2 = new java.util.ArrayList();
        inner0.put("demoPerson", list2);

        com.ibm.ws.webservices.engine.description.OperationDesc demoPerson2Op = _demoPerson2Op();
        list2.add(demoPerson2Op);

        operationDescriptions.put("DemoRPC",inner0);
        operationDescriptions = java.util.Collections.unmodifiableMap(operationDescriptions);
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _demoHandler0Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc demoHandler0Op = null;
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params0 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "person"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "person"), rpc.demo.Person.class, false, false, false, false, true, false), 
          };
        _params0[0].setOption("partQNameString","{http://demo.rpc}person");
        _params0[0].setOption("inputPosition","0");
        _params0[0].setOption("partName","person");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc0 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "demoHandlerReturn"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "person"), rpc.demo.Person.class, true, false, false, false, true, false); 
        _returnDesc0.setOption("partQNameString","{http://demo.rpc}person");
        _returnDesc0.setOption("outputPosition","0");
        _returnDesc0.setOption("partName","person");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults0 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        demoHandler0Op = new com.ibm.ws.webservices.engine.description.OperationDesc("demoHandler", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoHandler"), _params0, _returnDesc0, _faults0, null);
        demoHandler0Op.setOption("buildNum","Lnd2450.01");
        demoHandler0Op.setOption("outputName","demoHandlerResponse");
        demoHandler0Op.setOption("ResponseNamespace","http://demo.rpc");
        demoHandler0Op.setOption("targetNamespace","http://demo.rpc");
        demoHandler0Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoHandlerResponse"));
        demoHandler0Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "DemoRPC"));
        demoHandler0Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "DemoRPC"));
        demoHandler0Op.setOption("inputName","demoHandlerRequest");
        demoHandler0Op.setOption("ResponseLocalPart","demoHandlerResponse");
        demoHandler0Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoHandlerRequest"));
        demoHandler0Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return demoHandler0Op;

    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _demoHolder1Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc demoHolder1Op = null;
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params0 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "fistName"), com.ibm.ws.webservices.engine.description.ParameterDesc.INOUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "lastName"), com.ibm.ws.webservices.engine.description.ParameterDesc.INOUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
          };
        _params0[0].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params0[0].setOption("inputPosition","0");
        _params0[0].setOption("partName","string");
        _params0[1].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params0[1].setOption("inputPosition","1");
        _params0[1].setOption("partName","string");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc0 = new com.ibm.ws.webservices.engine.description.ParameterDesc(null, com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://websphere.ibm.com/webservices/", "Void"), void.class, true, false, false, false, true, true); 
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults0 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        demoHolder1Op = new com.ibm.ws.webservices.engine.description.OperationDesc("demoHolder", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoHolder"), _params0, _returnDesc0, _faults0, null);
        demoHolder1Op.setOption("buildNum","Lnd2450.01");
        demoHolder1Op.setOption("ResponseNamespace","http://demo.rpc");
        demoHolder1Op.setOption("targetNamespace","http://demo.rpc");
        demoHolder1Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoHolder"));
        demoHolder1Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "DemoRPC"));
        demoHolder1Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "DemoRPC"));
        demoHolder1Op.setOption("ResponseLocalPart","demoHolder");
        demoHolder1Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoHolder"));
        demoHolder1Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return demoHolder1Op;

    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _demoPerson2Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc demoPerson2Op = null;
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
        demoPerson2Op = new com.ibm.ws.webservices.engine.description.OperationDesc("demoPerson", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoPerson"), _params0, _returnDesc0, _faults0, null);
        demoPerson2Op.setOption("buildNum","Lnd2450.01");
        demoPerson2Op.setOption("outputName","demoPersonResponse");
        demoPerson2Op.setOption("ResponseNamespace","http://demo.rpc");
        demoPerson2Op.setOption("targetNamespace","http://demo.rpc");
        demoPerson2Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoPersonResponse"));
        demoPerson2Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "DemoRPC"));
        demoPerson2Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "DemoRPC"));
        demoPerson2Op.setOption("inputName","demoPersonRequest");
        demoPerson2Op.setOption("ResponseLocalPart","demoPersonResponse");
        demoPerson2Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "demoPersonRequest"));
        demoPerson2Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return demoPerson2Op;

    }


    private static void initTypeMappings() {
        typeMappings = new java.util.HashMap();
        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://demo.rpc", "person"),
                         rpc.demo.Person.class);

        typeMappings = java.util.Collections.unmodifiableMap(typeMappings);
    }

    public java.util.Map getTypeMappings() {
        return typeMappings;
    }

    public Class getJavaType(javax.xml.namespace.QName xmlName) {
        return (Class) typeMappings.get(xmlName);
    }

    public java.util.Map getOperationDescriptions(String portName) {
        return (java.util.Map) operationDescriptions.get(portName);
    }

    public java.util.List getOperationDescriptions(String portName, String operationName) {
        java.util.Map map = (java.util.Map) operationDescriptions.get(portName);
        if (map != null) {
            return (java.util.List) map.get(operationName);
        }
        return null;
    }

}
