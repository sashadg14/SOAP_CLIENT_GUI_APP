/**
 * CustomServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package org.apache.ws.axis2;


/**
 *  CustomServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class CustomServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public CustomServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public CustomServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    // No methods generated for meps other than in-out

    // No methods generated for meps other than in-out

    // No methods generated for meps other than in-out

    /**
     * auto generated Axis2 call back method for getSubsections method
     * override this method for handling normal response from getSubsections operation
     */
    public void receiveResultgetSubsections(
        org.apache.ws.axis2.CustomServiceStub.GetSubsectionsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getSubsections operation
     */
    public void receiveErrorgetSubsections(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getSections method
     * override this method for handling normal response from getSections operation
     */
    public void receiveResultgetSections(
        org.apache.ws.axis2.CustomServiceStub.GetSectionsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getSections operation
     */
    public void receiveErrorgetSections(java.lang.Exception e) {
    }

    // No methods generated for meps other than in-out

    /**
     * auto generated Axis2 call back method for getInfoFromSubsection method
     * override this method for handling normal response from getInfoFromSubsection operation
     */
    public void receiveResultgetInfoFromSubsection(
        org.apache.ws.axis2.CustomServiceStub.GetInfoFromSubsectionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getInfoFromSubsection operation
     */
    public void receiveErrorgetInfoFromSubsection(java.lang.Exception e) {
    }
}
