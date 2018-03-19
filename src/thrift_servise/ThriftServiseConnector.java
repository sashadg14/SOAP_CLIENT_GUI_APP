package thrift_servise;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import thrift_servise.servise.JsReferenceService;
import thrift_servise.servise.JsRefference;
import thrift_servise.servise.Section;
import thrift_servise.servise.Subsection;

import java.util.ArrayList;

public class ThriftServiseConnector{

    String ip="localhost";
    int port=9090;

    public JsRefference getJsRefference() {
        try {
            TTransport transport= new TSocket(ip, port);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            JsReferenceService.Client client = new JsReferenceService.Client(protocol);
            JsRefference jsRefference=(client.getJsRefferense());
            transport.close();
            return jsRefference;
        } catch (TException x) {
            return null;
        }
    }

    public Subsection getSubsection(String sectionName, String subsectionName) {
        try {
            TTransport transport= new TSocket("localhost", port);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            JsReferenceService.Client client = new JsReferenceService.Client(protocol);
            Subsection subsection=client.getSubsection(sectionName,subsectionName);
            transport.close();
                return subsection;
        } catch (TException x) {
            return null;
        }
    }

    public void deleteSubsection(String sectionName, String subsectionName) {
        try {
            TTransport transport= new TSocket(ip, port);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            JsReferenceService.Client client = new JsReferenceService.Client(protocol);
            client.deleteSubsection(sectionName,subsectionName);
            transport.close();
        } catch (TException x) {
        }
    }

    public void updateSubsection(String sectionName, String subsectionName, String newInfo) {
        try {
            TTransport transport= new TSocket(ip, port);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            JsReferenceService.Client client = new JsReferenceService.Client(protocol);
            client.updateSubsection(sectionName,new Subsection(subsectionName,newInfo));
            transport.close();
        } catch (TException x) {
        }
    }

    public void addSubsection(String sectionName, String subsection) {
        try {
            TTransport transport= new TSocket(ip, port);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            JsReferenceService.Client client = new JsReferenceService.Client(protocol);
            client.addSubsection(sectionName,new Subsection(subsection,""));
            transport.close();
        } catch (TException x) {
        }
    }

    public void addSection(String section) {
        try {
            TTransport transport= new TSocket(ip, port);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            JsReferenceService.Client client = new JsReferenceService.Client(protocol);
            client.addSection(new Section(section,new ArrayList<>()));
            transport.close();
        } catch (TException x) {
        }
    }
    
}
