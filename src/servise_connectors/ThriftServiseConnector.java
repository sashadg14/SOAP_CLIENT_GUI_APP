package servise_connectors;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import thrift_servise.JsReferenceService;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class ThriftServiseConnector implements ServiseConnectorInterphace {

    @Override
    public List<String> getSectionsArray() {
        try {
            TTransport transport= new TSocket("localhost", 9090);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            JsReferenceService.Client client = new JsReferenceService.Client(protocol);
            List<String> strings=(client.getSections());
            transport.close();
            if (strings!=null)
                return strings;
            return new ArrayList<>();
        } catch (TException x) {
            return new ArrayList<>();
        }
    }

    @Override
    public List<String> getSubsections(String section) {
        try {
            TTransport transport= new TSocket("localhost", 9090);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            JsReferenceService.Client client = new JsReferenceService.Client(protocol);
            List<String> strings=(client.getSubsections(section));
            transport.close();
            if (strings!=null)
                return strings;
            return new ArrayList<>();
        } catch (TException x) {
            return new ArrayList<>();
        }
    }

    @Override
    public String getSubsectionInfo(String sectionName, String subsectionName) {
        try {
            TTransport transport= new TSocket("localhost", 9090);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            JsReferenceService.Client client = new JsReferenceService.Client(protocol);
            String string=(client.getSubsectionInfo(sectionName,subsectionName));
            transport.close();
            if (string!=null)
                return string;
            return "";
        } catch (TException x) {
            return "";
        }
    }

    @Override
    public void deleteSubsection(String sectionName, String subsectionName) {
        try {
            TTransport transport= new TSocket("localhost", 9090);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            JsReferenceService.Client client = new JsReferenceService.Client(protocol);
            client.deleteSubsection(sectionName,subsectionName);
            transport.close();
        } catch (TException x) {
        }
    }

    @Override
    public void setInfoInSubsection(String sectionName, String subsectionName, String newText) {
        try {
            TTransport transport= new TSocket("localhost", 9090);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            JsReferenceService.Client client = new JsReferenceService.Client(protocol);
            client.setInfoInSubsection(sectionName,subsectionName,newText);
            transport.close();
        } catch (TException x) {
        }
    }

    @Override
    public void addSubsection(String sectionName, String subsectionName) {
        try {
            TTransport transport= new TSocket("localhost", 9090);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            JsReferenceService.Client client = new JsReferenceService.Client(protocol);
            client.addSubsection(sectionName,subsectionName);
            transport.close();
        } catch (TException x) {
        }
    }

    @Override
    public void addSection(String sectionName) {
        try {
            TTransport transport= new TSocket("localhost", 9090);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            JsReferenceService.Client client = new JsReferenceService.Client(protocol);
            client.addSection(sectionName);
            transport.close();
        } catch (TException x) {
        }
    }
    
}
