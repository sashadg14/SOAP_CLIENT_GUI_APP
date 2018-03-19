package soap;

import org.apache.ws.axis2.CustomServiceStub;

import java.rmi.RemoteException;

public class SOAPServiseConnector{
    private final String END_POINT = "http://localhost:8080/axis2/services/CustomService?wsdl";

    public CustomServiceStub.JsRefference getJsRefference() {
        try {
            CustomServiceStub stub = new CustomServiceStub(END_POINT);
            CustomServiceStub.GetJsRefference getJsRefference= new CustomServiceStub.GetJsRefference();
            CustomServiceStub.GetJsRefferenceResponse getJsRefferenceResponse = stub.getJsRefference(getJsRefference);
            CustomServiceStub.JsRefference jsRefference = getJsRefferenceResponse.get_return();
            return jsRefference;
        } catch (RemoteException e) {
            return null;
        }
    }

    public CustomServiceStub.Subsection getSubsection(String sectionName, String subsectionName) {
        try {
            CustomServiceStub stub = new CustomServiceStub(END_POINT);
            CustomServiceStub.GetSubsection getSubsection = new CustomServiceStub.GetSubsection();
            getSubsection.setSectionName(sectionName);
            getSubsection.setSubsectionName(subsectionName);
            CustomServiceStub.GetSubsectionResponse getInfoFromSubsectionResp = stub.getSubsection(getSubsection);
            CustomServiceStub.Subsection response = getInfoFromSubsectionResp.get_return();

            if (response != null)
                return response;
        } catch (RemoteException e) {
        }
        return null;
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



    public void updateSubsection(String sectionName, String subsectionName,String newText) {
        try {
            CustomServiceStub stub = new CustomServiceStub(END_POINT);
            CustomServiceStub.UpdateSubsection updateSubsection= new CustomServiceStub.UpdateSubsection();

            CustomServiceStub.Subsection subsection=new CustomServiceStub.Subsection();
            subsection.setName(subsectionName);
            subsection.setInfo(newText);

            updateSubsection.setSectionName(sectionName);
            updateSubsection.setSubsection(subsection);
            stub.updateSubsection(updateSubsection);
        } catch (RemoteException ignored) {
        }
        ;
    }

    public void addSubsection(String sectionName, String subsectionName) {
        try {
            CustomServiceStub stub = new CustomServiceStub(END_POINT);
            CustomServiceStub.AddSubsection addSubsection = new CustomServiceStub.AddSubsection();
            addSubsection.setSectionName(sectionName);
            CustomServiceStub.Subsection subsection=new CustomServiceStub.Subsection();
            subsection.setName(subsectionName);
            subsection.setInfo("");
            addSubsection.setSubsection(subsection);
            stub.addSubsection(addSubsection);
        } catch (RemoteException ignored) {
        }
    }

    public void addSection(String sectionName) {
        try {
            CustomServiceStub stub = new CustomServiceStub(END_POINT);
            CustomServiceStub.AddSection addSection = new CustomServiceStub.AddSection();
            CustomServiceStub.Section section=new CustomServiceStub.Section();
            section.setName(sectionName);
            //System.out.println(sectionName);
            section.setSubsectionsNames(new String[]{});
            addSection.setSection(section);
            stub.addSection(addSection);
        } catch (RemoteException ignored){}
    }
}
