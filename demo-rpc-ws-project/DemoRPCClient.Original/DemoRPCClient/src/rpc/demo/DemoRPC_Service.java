/**
 * DemoRPC_Service.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * Lnd2450.01 v121624103743
 */

package rpc.demo;

public interface DemoRPC_Service extends javax.xml.rpc.Service {
    public rpc.demo.DemoRPC_PortType getDemoRPC() throws javax.xml.rpc.ServiceException;

    public java.lang.String getDemoRPCAddress();

    public rpc.demo.DemoRPC_PortType getDemoRPC(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
