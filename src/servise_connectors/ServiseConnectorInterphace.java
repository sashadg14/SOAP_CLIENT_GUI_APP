package servise_connectors;

import org.apache.ws.axis2.CustomServiceStub;

import java.rmi.RemoteException;
import java.util.List;

public interface ServiseConnectorInterphace {
    List<String> getSectionsArray();

    List<String>getSubsections(String section);

    String getSubsectionInfo(String sectionName, String subsectionName);

    void deleteSubsection(String sectionName, String subsectionName);

    void setInfoInSubsection(String sectionName, String subsectionName,String newText);

    void addSubsection(String sectionName, String subsectionName);
    void addSection(String sectionName);
}
