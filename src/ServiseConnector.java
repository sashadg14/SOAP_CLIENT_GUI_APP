import org.apache.ws.axis2.CustomServiceStub;

import java.rmi.RemoteException;

public class ServiseConnector {
    private final String END_POINT = "http://localhost:8080/axis2/services/CustomService?wsdl";

    String[] getSectionsArray() throws RemoteException {
        CustomServiceStub stub = new CustomServiceStub(END_POINT);
        CustomServiceStub.GetSections getSections=new CustomServiceStub.GetSections();
        CustomServiceStub.GetSectionsResponse getSectionsResponse= stub.getSections(getSections);
        return getSectionsResponse.get_return();
    }
}
