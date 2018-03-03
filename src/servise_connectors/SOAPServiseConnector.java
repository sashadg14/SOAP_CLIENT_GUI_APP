package servise_connectors;

import org.apache.ws.axis2.CustomServiceStub;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SOAPServiseConnector implements ServiseConnectorInterphace {
    private final String END_POINT = "http://localhost:8080/axis2/services/CustomService?wsdl";

    public List<String> getSectionsArray() {
        try {
            CustomServiceStub stub = new CustomServiceStub(END_POINT);
            CustomServiceStub.GetSections getSections = new CustomServiceStub.GetSections();
            CustomServiceStub.GetSectionsResponse getSectionsResponse = stub.getSections(getSections);
            String[] strings = getSectionsResponse.get_return();
            if (strings != null)
                return Arrays.asList(strings);
            else return new ArrayList<>();
        } catch (RemoteException e) {
            return new ArrayList<>();
        }
    }

    public List<String> getSubsections(String section) {
        try {
            CustomServiceStub stub = new CustomServiceStub(END_POINT);
            CustomServiceStub.GetSubsections getSubsections = new CustomServiceStub.GetSubsections();
            getSubsections.setSectionName(section);
            CustomServiceStub.GetSubsectionsResponse getSubsectionsResponse = stub.getSubsections(getSubsections);
            String[] strings = getSubsectionsResponse.get_return();
            if (strings != null)
                return Arrays.asList(strings);
            else return new ArrayList<>();
        } catch (RemoteException e) {
            return new ArrayList<>();
        }
    }

    public String getSubsectionInfo(String sectionName, String subsectionName) {
        try {
            CustomServiceStub stub = new CustomServiceStub(END_POINT);
            CustomServiceStub.GetInfoFromSubsection getInfoFromSubsection = new CustomServiceStub.GetInfoFromSubsection();
            getInfoFromSubsection.setSectionName(sectionName);
            getInfoFromSubsection.setSubsectionName(subsectionName);
            CustomServiceStub.GetInfoFromSubsectionResponse getInfoFromSubsection1 = stub.getInfoFromSubsection(getInfoFromSubsection);
            String response = getInfoFromSubsection1.get_return();
            if (response != null)
                return response;
            else return "";
        } catch (RemoteException e) {
            return "";
        }
    }

    public void deleteSubsection(String sectionName, String subsectionName) {
        try {
            CustomServiceStub stub = new CustomServiceStub(END_POINT);
            CustomServiceStub.DeleteSubsection deleteSubsection = new CustomServiceStub.DeleteSubsection();
            deleteSubsection.setSectionName(sectionName);
            deleteSubsection.setSubsectionName(subsectionName);
            stub.deleteSubsection(deleteSubsection);
        } catch (RemoteException ignored) {
        }
    }

    public void setInfoInSubsection(String sectionName, String subsectionName, String newText) {
        try {
            CustomServiceStub stub = new CustomServiceStub(END_POINT);
            CustomServiceStub.SetInfoToSubsection setInfoToSubsection = new CustomServiceStub.SetInfoToSubsection();
            setInfoToSubsection.setSectionName(sectionName);
            setInfoToSubsection.setSubsectionName(subsectionName);
            setInfoToSubsection.setNewText(newText);
            stub.setInfoToSubsection(setInfoToSubsection);
        } catch (RemoteException ignored) {
        }
        ;
    }

    public void addSubsection(String sectionName, String subsectionName) {
        try {
            CustomServiceStub stub = new CustomServiceStub(END_POINT);
            CustomServiceStub.AddSubsection addSubsection = new CustomServiceStub.AddSubsection();
            addSubsection.setSectionName(sectionName);
            addSubsection.setSubsectionName(subsectionName);
            stub.addSubsection(addSubsection);
        } catch (RemoteException ignored) {
        }
    }

    public void addSection(String sectionName) {
        try {
            CustomServiceStub stub = new CustomServiceStub(END_POINT);
            CustomServiceStub.AddSection addSection = new CustomServiceStub.AddSection();
            addSection.setSectionName(sectionName);
            stub.addSection(addSection);
        } catch (RemoteException ignored){}
    }
}
